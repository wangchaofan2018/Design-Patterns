package strategy;

/**
 * Created by wangchaofan on 2020/11/12.
 */
public class Main {
    public static void main(String[] args) {
        SortAnnotionFactory factory = new SortAnnotionFactory();
        ISortAlg sortAlg = factory.getSorter("QuickSort");
        sortAlg.sort();
    }
}
