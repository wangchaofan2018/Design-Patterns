package builder;

/**
 * Created by wangchaofan on 2020/10/28.
 */
public class Main {
    public static void main(String[] args) {
        ResourcePoolConfig config = new ResourcePoolConfig.Builder()
                .setName("post")
                .setMaxActive(10)
                .setMaxIdle(10)
                .setMinIdle(0)
                .setMaxWait(300)
                .build();
    }
}
