package adapter;

/**
 * Created by wangchaofan on 2020/10/29.
 */
public class DBSocket implements DBSocketInterface {
    @Override
    public void powerWithThreeHole() {
        System.out.println("三孔插头充电");
    }
}
