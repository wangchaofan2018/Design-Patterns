package singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by wangchaofan on 2020/10/27.
 */
//懒汉式 第一次执行时加载
public class IdGenerator1 {
    private AtomicLong id = new AtomicLong(0);
    private static IdGenerator1 instance;

//    //方法加锁 并发度低 不推荐
//    public static synchronized IdGenerator1 getInstance() {
//        if (instance == null) {
//            instance = new IdGenerator1();
//        }
//        return instance;
//    }


    //使用双重检测或者静态内部类 下面是双重检测
    public static IdGenerator1 getInstance(){
        if (instance == null) {
            synchronized (IdGenerator1.class) {
                if (instance == null) {
                    instance = new IdGenerator1();
                }
            }
        }
        return instance;
    }

    public Long getId() {
        return id.incrementAndGet();
    }
}
