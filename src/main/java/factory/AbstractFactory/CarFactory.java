package factory.AbstractFactory;

/**
 * Created by wangchaofan on 2020/11/3.
 */
public abstract class CarFactory {
    public abstract AudiCar createAudiCar();

    public abstract BenzCar createBenzCar();

    public abstract BmwCar createBmwCar();
}
