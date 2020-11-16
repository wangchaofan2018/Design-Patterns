package principle.ISP;

import principle.ISP.should_be.*;

/**
 * Created by wangchaofan on 2020/11/3.
 */
public class Teddy extends Dog {
    private String name;
    public Teddy(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("run in the street");
    }


}
