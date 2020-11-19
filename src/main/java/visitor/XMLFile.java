package visitor;

/**
 * Created by wangchaofan on 2020/11/19.
 */
public class XMLFile extends ResourceFile {
    public XMLFile(String file) {
        super(file);
    }

    @Override
    public void extract2file() {
        System.out.println("解析XML文件。。。");
    }
}
