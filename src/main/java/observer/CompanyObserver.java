package observer;

/**
 * Created by wangchaofan on 2020/11/5.
 */
public class CompanyObserver extends Observer {

    private String brand;

    CompanyObserver(String brand) {
        this.brand = brand;
    }

    @Override
    public void update(String message) {
        System.out.println(brand + "公司得到最新消息：" + message);
        //执行通知到所有人
    }
}
