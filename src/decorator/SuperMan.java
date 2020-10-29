package decorator;

/**
 * Created by wangchaofan on 2020/10/29.
 */
public class SuperMan implements Man {
    private Man man;
    SuperMan(Man man) {
        this.man = man;
    }
    @Override
    public void sayHi(String s) {
        System.out.print("来自超人的消息： ");
        man.sayHi(s);
    }
}
