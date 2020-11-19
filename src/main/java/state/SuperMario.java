package state;

/**
 * Created by wangchaofan on 2020/11/19.
 */
public class SuperMario extends IMario {
    public SuperMario(MarioStateMachine machine) {
        super(machine);
        state = State.SUPPER;
    }

    @Override
    public State getState() {
        return state;
    }

    @Override
    public void getMushroom() {
        machine.setScore(machine.getScore()+100);
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
        machine.setScore(machine.getScore() - 100);
        machine.setCurrentState(new SmallMario(machine));
        printTransform(machine.getCurrentState().state);
    }
}
