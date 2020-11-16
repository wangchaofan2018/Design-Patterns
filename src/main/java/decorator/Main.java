package decorator;

/**
 * Created by wangchaofan on 2020/10/29.
 */
public class Main {
    public static void main(String[] args) {
        Man man = new Human();
        man.sayHi("你好");
        Man superman = new SuperMan(man);
        superman.sayHi("你好");
    }
}
