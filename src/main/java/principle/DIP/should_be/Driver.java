package principle.DIP.should_be;

/**
 * Created by wangchaofan on 2020/11/3.
 */
public class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public void drive(Car car) {
        System.out.println(name+"老司机上车，"+car.run());
    }
}
