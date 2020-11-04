package principle.ISP;

/**
 * Created by wangchaofan on 2020/11/3.
 */
public class Main {
    public static void main(String[] args) {
        Bird bird = new Pigeon(20100323l);
        Dog dog = new Teddy("tom");
        bird.run();
        dog.fly();
    }
}
