package state;

/**
 * Created by wangchaofan on 2020/11/19.
 */
public abstract class IMario {

    protected State state;
    protected MarioStateMachine machine;
    public IMario(MarioStateMachine machine) {
        this.machine = machine;
    }

    abstract State getState();

    public abstract void getMushroom();

    public abstract void getCape();

    public abstract void getFireFlower();

    public abstract void meetMonster();


    public void printTransform(State state1) {
        System.out.println("current status: "+state.desc+" after the change: "+state1.desc+" total score: "+machine.getScore());
    }
}
