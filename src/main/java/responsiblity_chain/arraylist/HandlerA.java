package responsiblity_chain.arraylist;

/**
 * Created by wangchaofan on 2020/11/13.
 */
public class HandlerA implements Handler {
    @Override
    public boolean handle(Object something) {
        boolean handled = false;
        System.out.println("A do something");
        //若能处理 使handled置为true
        return handled;
    }
}
