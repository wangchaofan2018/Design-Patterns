package factory.AbstractFactory;

/**
 * Created by wangchaofan on 2020/11/3.
 */
public class Main {
    public static void main(String[] args) {
        CarFactory factory = new BusinessCarFactory();
        AudiCar audiCar1 = factory.createAudiCar();
        audiCar1.drive();
        factory = new SportCarFactory();
        AudiCar audiCar2 = factory.createAudiCar();
       audiCar2.drive();

    }
}
