package strategy;

/**
 * Created by wangchaofan on 2020/11/12.
 */
@Strategy
public class QuickSort implements ISortAlg {
    @Override
    public void sort() {
        System.out.println("快排");
    }
}
