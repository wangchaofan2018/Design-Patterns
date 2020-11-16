package factory.FactoryMethod.car;

import factory.AbstractFactory.Car;

/**
 * Created by wangchaofan on 2020/11/9.
 */
public class Main {
    public static void main(String[] args) {
        CarFactory factory = new BenzCarFactory();
        Car car = factory.createCar();
        car.drive();
    }
}
