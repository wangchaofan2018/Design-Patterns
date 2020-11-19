package visitor.should_be;

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
        files.forEach(u->{
            u.accept(executor);
        });
    }
}
