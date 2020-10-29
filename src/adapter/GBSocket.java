package adapter;

/**
 * Created by wangchaofan on 2020/10/29.
 */
public class GBSocket implements GBSocketInterface {
    GBSocket() {
        System.out.println("国标两孔插头");
    }
    @Override
    public void powerWithTwoHole() {
        System.out.println("两孔插头充电");
    }
}
