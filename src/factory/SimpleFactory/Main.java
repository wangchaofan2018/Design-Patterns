package factory.SimpleFactory;

import factory.RuleConfig;

/**
 * Created by wangchaofan on 2020/10/27.
 */
public class Main {
    public static void main(String[] args) {
        ConfigResource resource = new ConfigResource();
        RuleConfig config = resource.load("./src/spring.xml");
    }
}
