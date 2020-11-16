package factory.AbstractFactory;

/**
 * Created by wangchaofan on 2020/11/3.
 */
public class SportCarFactory  extends CarFactory{
    @Override
    public AudiCar createAudiCar() {
        return new AudiSportCar();
    }

    @Override
    public BenzCar createBenzCar() {
        return new BenzSportCar();
    }

    @Override
    public BmwCar createBmwCar() {
        return new BmwSportCar();
    }
}
