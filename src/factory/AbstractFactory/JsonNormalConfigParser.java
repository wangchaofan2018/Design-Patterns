package factory.AbstractFactory;

import factory.ConfigParser;
import factory.RuleConfig;

/**
 * Created by wangchaofan on 2020/10/28.
 */
public class JsonNormalConfigParser implements ConfigParser {
    @Override
    public RuleConfig parse(String text) {
        return new RuleConfig();
    }
}
