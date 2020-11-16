package strategy;

import java.io.File;

/**
 * Created by wangchaofan on 2020/11/12.
 */
public class Sorter {
    private static final long GB = 1024 * 1024 * 1024;

    public void sortFile(String path) {
        File file = new File(path);
        long size = file.length();
        ISortAlg sortAlg;
        if (size < 6 * GB) {
            sortAlg = new QuickSort();
        } else if (size < 10 * GB) {
            sortAlg = new ExternalSort();
        } else if (size < 100 * GB) {
            sortAlg = new ConcurrentExternalSort();
        } else {
            sortAlg = new MapReduceSort();
        }
        sortAlg.sort();
    }
}
