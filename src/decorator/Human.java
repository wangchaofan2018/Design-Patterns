package decorator;

/**
 * Created by wangchaofan on 2020/10/29.
 */
public class Human implements Man {
    @Override
    public void sayHi(String s) {
        System.out.println("你好");
    }
}
