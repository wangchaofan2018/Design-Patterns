package visitor;

/**
 * Created by wangchaofan on 2020/11/19.
 */
public class YAMLFile extends ResourceFile {
    public YAMLFile(String path) {
        super(path);
    }

    @Override
    public void extract2file() {
        System.out.println("YAML文件解析。。。");
    }
}
