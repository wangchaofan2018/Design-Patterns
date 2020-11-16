package prototype;

/**
 * Created by wangchaofan on 2020/11/4.
 */
public class Main {
    public static void main(String[] args) {
//        Car car1 = new Car("布加迪", 100, 500, 200, "德国大众", "威龙", 500.00f);
//        System.out.println(car1);
//        Car car2 = new Car("布加迪", 100, 500, 200, "德国大众", "威龙", 500.00f);
//        System.out.println(car2);
//
//        try {
//            Car car3 =(Car) car1.clone();
//            System.out.println(car3);
//            car3.setWidth(400);
//            System.out.println(car1);
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }

        Driver driver = new Driver("小飞", "18866668888");
        Car car1 = new Car("奥迪", 100, 500, 200, "德国大众", "A9", 500.00f, driver);
        System.out.println(car1);

        try {
            Car car2 =(Car) car1.clone();
            System.out.println("自己copy出了一辆车==》");
            System.out.println(car2);
            Driver driver1 = car2.getDriver();
            System.out.println("改名");
            driver1.setName("阿飞");
            System.out.println(car1);
            System.out.println(car2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
