package strategy;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wangchaofan on 2020/11/12.
 */
public class SortAnnotionFactory {
    private Map<String, ISortAlg> map = new HashMap<>();

    public SortAnnotionFactory() {
        List<Class<?>> list = getAnnotationClassList("/Users/wangchaofan/github/Design-Patterns/src/main/java/strategy","strategy");
        for (int i=0;i<list.size();i++) {
            Class<?> clz = list.get(i);
            String name = clz.getSimpleName();
            try {
                ISortAlg object = (ISortAlg)clz.newInstance();
                map.put(name, object);
            } catch (Exception e) {
                System.out.println("创建实例失败");
                e.printStackTrace();
            }
        }
    }

    public ISortAlg getSorter(String type) {
        return map.get(type);
    }

    public List<Class<?>> getAnnotationClassList(String path,String module) {
        File files = new File(path);
        List<Class<?>> list = new ArrayList<>();
        for (File file : files.listFiles()) {
            if (file.isFile() && file.getName().endsWith(".java")) {
                String rawName = file.getName();
                String className = module + "." + rawName.substring(0, rawName.lastIndexOf("."));
                Class<?> cls = null;
                try {
                    cls = Class.forName(className, false,Thread.currentThread().getContextClassLoader());
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                    System.out.println("类加载出错");
                }
                if (cls.isAnnotationPresent(Strategy.class)) {
                    list.add(cls);
                }
                if (cls == null) {
                    System.out.println("未加载到类");
                    return null;
                }
            }
        }
        return list;
    }
}
