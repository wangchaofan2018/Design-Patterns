package responsiblity_chain.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangchaofan on 2020/11/13.
 */
public class HandlerChain {
    private List<Handler> handlers = new ArrayList<>();

    public void addHandler(Handler handler) {
        handlers.add(handler);
    }

    public void handle(Object o) {
        for (Handler handler : handlers) {
            boolean handled = handler.handle(o);
            if (handled) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        Object o = new Object();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle(o);
    }
}
