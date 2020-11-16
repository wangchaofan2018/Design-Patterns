package principle.DIP;

import principle.DIP.should_be.Car;

/**
 * Created by wangchaofan on 2020/11/3.
 */
public class Benz implements Car {
    @Override
    public String run() {
        return "奔驰启动 开车了。。。";
    }
}
