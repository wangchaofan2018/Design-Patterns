package test;

/**
 * Created by wangchaofan on 2020/11/12.
 */
public abstract class TestCase {

    public final void print() {
        System.out.println("TestCase");
        execute();
    }

    public void execute() {
        System.out.println("TestCase execute");
    }
}
