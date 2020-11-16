package facede;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangchaofan on 2020/11/16.
 */
public class Facade {
    List<HomeKit> list = new ArrayList<>();

    public Facade() {
        list.add(new Light());
        list.add(new Light());
        list.add(new Light());
        list.add(new TV());
        list.add(new Washer());
    }

    public void open() {
        for (int i=0;i<list.size();i++) {
            list.get(i).open();
        }
    }
}
