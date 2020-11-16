package responsiblity_chain.linkednode;

/**
 * Created by wangchaofan on 2020/11/13.
 */
public class HandlerB extends Handler {
    @Override
    public boolean isHandle() {
        System.out.println("handlerB do something");
        return false;
    }
}
