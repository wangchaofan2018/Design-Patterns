package responsiblity_chain.linkednode;

/**
 * Created by wangchaofan on 2020/11/13.
 */
public class HandlerChain {
    private Handler head;
    private Handler tail;

    public void addHandler(Handler handler) {
        if (head == null) {
            head = handler;
            tail = handler;
        } else {
            tail.setNextHandler(handler);
            tail = handler;
        }
    }

    public void handle() {
        head.handle();
    }

    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }
}
