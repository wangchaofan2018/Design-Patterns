package observer;

/**
 * Created by wangchaofan on 2020/11/5.
 */
public abstract class Newspaper {
    public abstract void registerObserver(Observer observer);

    public abstract void removeObserver(Observer observer);

    public abstract void notifyObservers(String message);
}
