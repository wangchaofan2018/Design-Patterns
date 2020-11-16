package factory.FactoryMethod.car;

import factory.AbstractFactory.Car;

/**
 * Created by wangchaofan on 2020/11/9.
 */
public class BenzCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new BenzCar();
    }
}
