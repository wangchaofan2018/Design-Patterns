package principle.ISP.should_be;

/**
 * Created by wangchaofan on 2020/11/3.
 */
public abstract class Bird implements SkyBehavior {


    @Override
    public void eat() {
        System.out.println("eat bugs");
    }

    @Override
    public void fly() {
        System.out.println("fly in sky");
    }

    @Override
    public void call() {
        System.out.println("tweet");
    }
}
