package observer.event_bus;

/**
 * Created by wangchaofan on 2020/11/11.
 */
public class WeChatMessage{

    @Subscribe
    public void message(Info text) {
        System.out.println("WeChat message : " + text);
    }
}
