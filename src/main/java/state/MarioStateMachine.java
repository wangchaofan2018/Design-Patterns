package state;

/**
 * Created by wangchaofan on 2020/11/19.
 */
public class MarioStateMachine {
    private int score;
    private IMario currentState;

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setCurrentState(IMario currentState) {
        this.currentState = currentState;
    }

    public MarioStateMachine() {
        score = 0;
        currentState = new SmallMario(this);
    }

    public IMario getCurrentState() {
        return currentState;
    }
}
