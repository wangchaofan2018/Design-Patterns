package bridge;

/**
 * Created by wangchaofan on 2020/10/29.
 */
public class MediumCoffee extends Coffee {
    public MediumCoffee(ICoffeeAdditives additives) {
        super(additives);
    }

    @Override
    public void OrderCoffee(int size) {
        System.out.println("中杯咖啡"+size+"杯");
    }


}
