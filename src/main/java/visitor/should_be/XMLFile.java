package visitor.should_be;

/**
 * Created by wangchaofan on 2020/11/19.
 */
public class XMLFile extends ResourceFile {
    public XMLFile(String file) {
        super(file);
    }

    @Override
    public void accept(Executor executor) {
        executor.parse(this);
    }
}
