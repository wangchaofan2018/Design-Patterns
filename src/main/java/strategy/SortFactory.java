package strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangchaofan on 2020/11/12.
 */
public class SortFactory {
    private static Map<String, ISortAlg> map = new HashMap<>();
    static{
        map.put("QuickSort", new QuickSort());
        map.put("ExternalSOrt", new ExternalSort());
        map.put("ConcurrentExternalSort", new ConcurrentExternalSort());
        map.put("MapReduceSort", new MapReduceSort());
    }

    public ISortAlg createSort(String type) {
        return map.get(type);
    }
}
