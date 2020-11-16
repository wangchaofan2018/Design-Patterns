package factory.FactoryMethod.car;

import factory.AbstractFactory.Car;

/**
 * Created by wangchaofan on 2020/11/9.
 */
public class BenzCar implements Car {
    @Override
    public void drive() {
        System.out.println("开车了");
    }
}
