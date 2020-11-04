package principle.DIP;


/**
 * Created by wangchaofan on 2020/11/3.
 */
public class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public void driveAudi(Audi audi) {
        System.out.println(name+"老司机上车，"+audi.run());
    }

    public void driveBenz(Benz benz) {
        System.out.println(name+"老司机上车，"+benz.run());
    }
}
