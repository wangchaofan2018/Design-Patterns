package principle.DIP;

/**
 * Created by wangchaofan on 2020/11/3.
 */

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("小飞");
        driver.driveAudi(new Audi());
        driver.driveBenz(new Benz());
    }
}
