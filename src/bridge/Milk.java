package bridge;

/**
 * Created by wangchaofan on 2020/10/29.
 */
public class Milk implements ICoffeeAdditives {
    @Override
    public void addSomething() {
        System.out.println("加奶");
    }
}
