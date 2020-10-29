package bridge;

/**
 * Created by wangchaofan on 2020/10/29.
 */
public class Main {
    public static void main(String[] args) {
        Coffee coffee = new LargeCoffee(new Sugar());
        coffee.OrderCoffee(3);
        coffee.checkQuality();
    }
}
