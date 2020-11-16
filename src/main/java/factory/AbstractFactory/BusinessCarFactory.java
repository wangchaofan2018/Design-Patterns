package factory.AbstractFactory;

/**
 * Created by wangchaofan on 2020/11/3.
 */
public class BusinessCarFactory extends CarFactory {
    @Override
    public AudiCar createAudiCar() {
        return new AudiBusinessCar();
    }

    @Override
    public BenzCar createBenzCar() {
        return new BenzBusinessCar();
    }

    @Override
    public BmwCar createBmwCar() {
        return new BmwBusinessCar();
    }
}
