package state;

/**
 * Created by wangchaofan on 2020/11/19.
 */
public class FireMario extends IMario {

    public FireMario(MarioStateMachine machine) {
        super(machine);
        state = State.FIRE;
    }

    @Override
    public State getState() {
        return state;
    }

    @Override
    public void getMushroom() {

    }

    @Override
    public void getCape() {

    }

    @Override
    public void getFireFlower() {

    }

    @Override
    public void meetMonster() {

    }
}
