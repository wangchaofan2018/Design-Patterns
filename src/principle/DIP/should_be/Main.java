package principle.DIP.should_be;

/**
 * Created by wangchaofan on 2020/11/3.
 */
public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("小飞");
        Audi audi = new Audi();
        driver.drive(audi);
        Benz benz = new Benz();
        driver.drive(benz);
    }
}
