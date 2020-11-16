package factory.FactoryMethod;

import factory.ConfigParser;
import factory.YamlConfigParser;

/**
 * Created by wangchaofan on 2020/10/27.
 */
public class YamlConfigParserFactory implements ConfigParserFactory {
    @Override
    public ConfigParser createParser() {
        return new YamlConfigParser();
    }
}
