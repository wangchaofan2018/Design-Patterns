package bridge;

import java.util.Random;

/**
 * Created by wangchaofan on 2020/10/29.
 */
public abstract class Coffee {
    protected ICoffeeAdditives additives;

    public Coffee(ICoffeeAdditives additives) {
        this.additives = additives;
    }

    public void checkQuality() {
        Random ran=new Random();
        additives.addSomething();
        System.out.println(String.format("%s 添加%s",additives.getClass().getSimpleName(),ran.nextBoolean()?"太多":"正常"));
    }

    public abstract void OrderCoffee(int size);
}
