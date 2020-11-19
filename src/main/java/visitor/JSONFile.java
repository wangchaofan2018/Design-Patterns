package visitor;

/**
 * Created by wangchaofan on 2020/11/19.
 */
public class JSONFile extends ResourceFile {
    public JSONFile(String path) {
        super(path);
    }

    @Override
    public void extract2file() {
        System.out.println("JSON解析。。。");
    }
}
