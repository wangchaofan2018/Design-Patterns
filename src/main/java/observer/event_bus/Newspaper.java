package observer.event_bus;

/**
 * Created by wangchaofan on 2020/11/11.
 */
public class Newspaper {
    @Subscribe
    public void message(Info text) {
        System.out.println("newspaper message :" + text);
    }

    @Subscribe
    public void shortMessage(String text) {
        System.out.println("short message :" + text);
    }
}
