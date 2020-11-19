package visitor;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangchaofan on 2020/11/19.
 */
public class Main {
    public static void main(String[] args) {
        Executor executor = new Executor();
        List<ResourceFile> files = new ArrayList<>();
        files.add(new JSONFile("a.json"));
        files.add(new XMLFile("b.xml"));
        files.add(new YAMLFile("c.yaml"));
        files.forEach (u->{
            //多态是动态绑定 在运行时获取对象的实际类型，而函数重载是静态绑定，在编译时不能获取对象的实际类型 下面会报错
//            executor.parse(u);
        });
    }
}
