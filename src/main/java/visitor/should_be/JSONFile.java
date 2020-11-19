package visitor.should_be;

/**
 * Created by wangchaofan on 2020/11/19.
 */
public class JSONFile extends ResourceFile {
    public JSONFile(String path) {
        super(path);
    }

    @Override
    public void accept(Executor executor) {
        executor.parse(this);
    }
}
