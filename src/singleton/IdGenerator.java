package singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by wangchaofan on 2020/10/27.
 */
//饿汉式 在类初始化时创建对象

public class IdGenerator {
    private AtomicLong id = new AtomicLong(0);
    private static IdGenerator instance = new IdGenerator();

    public Long getId() {
        return id.incrementAndGet();
    }
}
