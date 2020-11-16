package builder;

/**
 * Created by wangchaofan on 2020/10/28.
 */
public class ResourcePoolConfig {
    private static final int DEFAULT_MAX_ACTIVE = 8;
    private static final int DEFAULT_MAX_IDLE = 8;
    private static final int DEFAULT_MIN_IDLE = 0;
    private static final int DEFAULT_MAX_WAIT_TIME = 6000;
    //配置池名称
    private String name;
    //最大连接数
    private int maxActive = DEFAULT_MAX_ACTIVE;
    //最小闲置数
    private int minIdle = DEFAULT_MAX_IDLE;
    //最大闲置数
    private int maxIdle = DEFAULT_MIN_IDLE;
    //最长等待时间
    private int maxWait = DEFAULT_MAX_WAIT_TIME;
//
//    /**
//     * 1.所有参数通过构造函数创建 缺点：参数过多时不好维护、易发生参数顺序错位问题
//     */
//    public ResourcePoolConfig(String name, int maxActive, int minIdle, int maxIdle, int maxWait) {
//        this.name = name;
//        this.maxActive = maxActive;
//        this.minIdle = minIdle;
//        this.maxIdle = maxIdle;
//        this.maxWait = maxWait;
//        if (minIdle > maxActive || minIdle > maxIdle) { throw new IllegalArgumentException("...");
//    }


    /**
     * 2.必要参数通过构造函数创建，其他参数通过set函数创建 缺点：必填参数过多时同情况1 、有依赖关系的配置项之间不能添加检验逻辑、若对象建好后不可修改 set方法不适用
     */
    public ResourcePoolConfig(String name) {
        this.name = name;
    }

    public void setMaxActive(int maxActive) {
        this.maxActive = maxActive;
    }
    // maxIdle与minIdle为相互依赖关系
    public void setMaxIdle(int maxIdle) {
        this.maxIdle = maxIdle;
    }

    public void setMinIdle(int minIdle) {
        this.minIdle = minIdle;
    }


    /**
     * 3.通过建造者模式来创建
     */

    private ResourcePoolConfig(Builder builder) {
        this.name = builder.name;
        this.minIdle = builder.minIdle;
        this.maxActive = builder.maxActive;
        this.maxIdle = builder.maxIdle;
        this.maxWait = builder.maxWait;
    }

    public static class Builder {
        private static final int DEFAULT_MAX_ACTIVE = 8;
        private static final int DEFAULT_MAX_IDLE = 8;
        private static final int DEFAULT_MIN_IDLE = 0;
        private static final int DEFAULT_MAX_WAIT_TIME = 6000;

        private String name;
        private int maxActive = DEFAULT_MAX_ACTIVE;
        private int maxIdle = DEFAULT_MAX_IDLE;
        private int minIdle = DEFAULT_MIN_IDLE;
        private int maxWait = DEFAULT_MAX_WAIT_TIME;

        public ResourcePoolConfig build() {
            //校验逻辑
            if (minIdle > maxActive || minIdle > maxIdle) {
                throw new IllegalArgumentException("请检查空闲连接范围设置");
            }
            if (name == null || "".equals(name)) {
                throw new IllegalArgumentException("名称未设置");
            }
            return new ResourcePoolConfig(this);
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setMaxIdle(int maxIdle) {
            this.maxIdle = maxIdle;
            return this;
        }

        public Builder setMinIdle(int minIdle) {
            this.minIdle = minIdle;
            return this;
        }

        public Builder setMaxActive(int maxActive) {
            this.maxActive = maxActive;
            return this;
        }

        public Builder setMaxWait(int maxWait) {
            this.maxWait = maxWait;
            return this;
        }

    }
}
