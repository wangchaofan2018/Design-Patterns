package facede;

/**
 * Created by wangchaofan on 2020/11/16.
 */
public class Main {
    public static void main(String[] args) {
        HomeKit light1 = new Light();
        HomeKit light2 = new Light();
        HomeKit light3 = new Light();
        HomeKit tv = new TV();
        HomeKit washer = new Washer();

        light1.open();
        light2.open();
        light3.open();
        tv.open();
        washer.open();

//        Facade facade = new Facade();
//        facade.open();

    }
}
