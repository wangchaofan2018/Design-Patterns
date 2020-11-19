package visitor.should_be;

/**
 * Created by wangchaofan on 2020/11/19.
 */
public abstract class ResourceFile {
    private String path;

    public ResourceFile(String path) {
        this.path = path;
    }

    public abstract void accept(Executor executor);
}
