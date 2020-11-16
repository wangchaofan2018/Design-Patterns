package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangchaofan on 2020/11/5.
 */
public class ChinaDailyNewspaper extends Newspaper {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        observers.forEach(u -> u.update(message));
    }
}
