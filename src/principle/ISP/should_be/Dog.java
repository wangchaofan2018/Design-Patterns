package principle.ISP.should_be;

/**
 * Created by wangchaofan on 2020/11/3.
 */
public abstract class Dog implements CommonBehavior,LandBehavior {
    public Dog() {

    }

    @Override
    public void eat() {
        System.out.println("eat bones");
    }

    @Override
    public void call() {
        System.out.println("wow");
    }

    @Override
    public void run() {
        System.out.println("running in street");
    }
}
