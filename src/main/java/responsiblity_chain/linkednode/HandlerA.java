package responsiblity_chain.linkednode;

/**
 * Created by wangchaofan on 2020/11/13.
 */
public class HandlerA extends Handler {
    @Override
    public boolean isHandle() {
        System.out.println("HandlerA do something");
        return false;
    }
}
