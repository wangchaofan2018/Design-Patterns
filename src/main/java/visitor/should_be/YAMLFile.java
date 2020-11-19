package visitor.should_be;

/**
 * Created by wangchaofan on 2020/11/19.
 */
public class YAMLFile extends ResourceFile {
    public YAMLFile(String path) {
        super(path);
    }

    @Override
    public void accept(Executor executor) {
        System.out.println("YAML文件解析。。。");
    }
}
