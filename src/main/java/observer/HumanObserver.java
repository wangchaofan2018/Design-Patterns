package observer;

/**
 * Created by wangchaofan on 2020/11/5.
 */
public class HumanObserver extends Observer {
    private String name;

    HumanObserver(String name) {
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println(name + "得到消息称：" + message);
    }
}
