package observer.event_bus;

import java.util.List;

/**
 * Created by wangchaofan on 2020/11/11.
 */
public class EventBus {
    private ObserverRegistry registry = new ObserverRegistry();

    public void register(Object object) {
        registry.register(object);
    }

    public void post(Object event) {
        List<ObserverAction> matchedObservers = registry.getMatchedObserverActions(event);
        for (ObserverAction action : matchedObservers) {
            action.execute(event);
        }
    }
}
