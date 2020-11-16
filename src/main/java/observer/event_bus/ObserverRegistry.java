package observer.event_bus;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import observer.Observer;

import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * Created by wangchaofan on 2020/11/5.
 */
public class ObserverRegistry {
    private ConcurrentMap<Class<?>, CopyOnWriteArraySet<ObserverAction>> registry = new ConcurrentHashMap<>();

    public void register(Object observer) {
        Map<Class<?>, Collection<ObserverAction>> observerActions = findAllObserverActions(observer);
        for (Map.Entry<Class<?>, Collection<ObserverAction>> entry : observerActions.entrySet()) {
            Class<?> eventType = entry.getKey();
            Collection<ObserverAction> eventActions = entry.getValue();
            CopyOnWriteArraySet<ObserverAction> registeredEventActions = registry.get(eventType);
            if (registeredEventActions == null) {
                registry.putIfAbsent(eventType, new CopyOnWriteArraySet<>());
                registeredEventActions = registry.get(eventType);
            }
            registeredEventActions.addAll(eventActions);
        }
    }

    public List<ObserverAction> getMatchedObserverActions(Object event) {
        List<ObserverAction> matchedObservers = new ArrayList<>();
        Class<?> clazz = event.getClass();
        for (Map.Entry<Class<?>,CopyOnWriteArraySet<ObserverAction>> entity : registry.entrySet()) {
            Class<?> methodType = entity.getKey();
            CopyOnWriteArraySet<ObserverAction> observerActions = entity.getValue();
            if (clazz.isAssignableFrom(methodType)) {
                matchedObservers.addAll(observerActions);
            }
        }
        return matchedObservers;
    }

    public Map<Class<?>, Collection<ObserverAction>> findAllObserverActions(Object observer) {
        Map<Class<?>, Collection<ObserverAction>> observerActions = new HashMap<>();
        Multimap<Class<?>, ObserverAction> multimap = ArrayListMultimap.create();
        Class<?> clazz = observer.getClass();
        for (Method method : getAnnotatedMethods(clazz)) {
            Class<?>[] paramterTypes = method.getParameterTypes();
            Class<?> eventType = paramterTypes[0];
            if (!observerActions.containsKey(eventType)) {
                observerActions.put(eventType, new ArrayList<>());
            }
            multimap.put(eventType, new ObserverAction(observer, method));
            observerActions.get(eventType).add(new ObserverAction(observer, method));
        }
        Map<Class<?>, Collection<ObserverAction>> temp = multimap.asMap();
        return observerActions;
    }

    public List<Method> getAnnotatedMethods(Class<?> clazz) {
        List<Method> annotatedMethods = new ArrayList<>();
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Subscribe.class)) {
                Class<?>[] paramterTypes = method.getParameterTypes();
                annotatedMethods.add(method);
            }
        }
        return annotatedMethods;
    }

}
