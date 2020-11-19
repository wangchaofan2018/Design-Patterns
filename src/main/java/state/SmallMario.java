package state;

/**
 * Created by wangchaofan on 2020/11/19.
 */
public class SmallMario extends IMario {


    public SmallMario(MarioStateMachine machine) {
        super(machine);
        state = State.SMALL;
    }

    @Override
    public State getState() {

        return state;
    }

    @Override
    public void getMushroom() {
        machine.setScore(machine.getScore()+100);
        machine.setCurrentState(new SuperMario(machine));
        printTransform(machine.getCurrentState().state);
    }

    @Override
    public void getCape() {
        machine.setScore(machine.getScore() + 200);
        machine.setCurrentState(new CapeMario(machine));
        printTransform(machine.getCurrentState().state);
    }

    @Override
    public void getFireFlower() {
        machine.setScore(machine.getScore() + 300);
        machine.setCurrentState(new FireMario(machine));
        printTransform(machine.getCurrentState().state);
    }

    @Override
    public void meetMonster() {
        machine.setScore(machine.getScore());
    }
}
