package state;

/**
 * Created by wangchaofan on 2020/11/19.
 */
public class Main {
    public static void main(String[] args) {
        MarioStateMachine machine = new MarioStateMachine();
        machine.getCurrentState().getMushroom();
        machine.getCurrentState().getCape();
    }
}
