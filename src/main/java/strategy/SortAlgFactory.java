package strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangchaofan on 2020/11/12.
 */
public class SortAlgFactory {
    private static final long GB = 1000 * 1000 * 1000;
    private static List<AlgRange> sortList = new ArrayList<>();
    static {
        sortList.add(new AlgRange(0, 6 * GB, new QuickSort()));
        sortList.add(new AlgRange(6 * GB, 10 * GB, new ExternalSort()));
        sortList.add(new AlgRange(10 * GB, 100 * GB, new ConcurrentExternalSort()));
        sortList.add(new AlgRange(100 * GB, Long.MAX_VALUE, new MapReduceSort()));
    }

    public ISortAlg getSort(long length) {
        for (AlgRange range : sortList) {
            if (range.inRange(length)) {
                return range.getSortAlg();
            }
        }
        return null;
    }


}
