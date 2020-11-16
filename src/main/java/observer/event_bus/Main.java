package observer.event_bus;

/**
 * Created by wangchaofan on 2020/11/11.
 */
public class Main {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        eventBus.register(new Newspaper());
        eventBus.register(new WeChatMessage());
        Info info = new Info("BBC","A fire has broken out in the American state of Florida","2020-01-20");
        eventBus.post(info);
        String text = "hello";
        eventBus.post(text);
    }
}
