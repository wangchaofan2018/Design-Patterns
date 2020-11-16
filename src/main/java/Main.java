import singleton.IdGenerator1;

/**
 * Created by wangchaofan on 2020/10/27.
 */
public class Main {
    public static void main(String[] args) {
        Long a = IdGenerator1.getInstance().getId();
        System.out.println(a);
    }
}
