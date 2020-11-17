package bridge;

/**
 * Created by wangchaofan on 2020/10/29.
 */
public class LargeCoffee extends Coffee {

    public LargeCoffee(ICoffeeAdditives additives) {
        super(additives);
    }
    @Override
    public void OrderCoffee(int size) {
        System.out.println("大杯咖啡"+size+"杯");
    }


}
