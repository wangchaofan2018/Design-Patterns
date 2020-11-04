package principle.ISP.should_be;

/**
 * Created by wangchaofan on 2020/11/3.
 */
public class Main {
    public static void main(String[] args) {
        Dog dog = new Teddy("tom");
        Bird bird = new Pigeon(20200031l);
        dog.call();
        dog.eat();
        dog.run();
        bird.eat();
        bird.call();
        bird.fly();
    }
}
