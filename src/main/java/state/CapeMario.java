package state;

/**
 * Created by wangchaofan on 2020/11/19.
 */
public class CapeMario extends IMario {
    public CapeMario(MarioStateMachine machine) {
        super(machine);
        state = State.CAPE;
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
