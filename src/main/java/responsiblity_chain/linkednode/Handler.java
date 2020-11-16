package responsiblity_chain.linkednode;

/**
 * Created by wangchaofan on 2020/11/13.
 */
public abstract class Handler {
    private Handler nextHandler;

    public void handle() {
        boolean flag = isHandle();
        if (!flag & nextHandler != null) {
            nextHandler.handle();
        }
    }

    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    public abstract boolean isHandle();
}
