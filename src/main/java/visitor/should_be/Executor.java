package visitor.should_be;



/**
 * Created by wangchaofan on 2020/11/19.
 */
public class Executor {
    public void parse(JSONFile file) {
        System.out.println("解析json");
    }

    public void parse(XMLFile file) {
        System.out.println("解析xml");
    }

    public void parse(YAMLFile file) {
        System.out.println("解析yaml");
    }
}
