package Factory.FactoryMethod;

import Factory.ConfigParser;
import Factory.YamlConfigParser;

/**
 * Created by wangchaofan on 2020/10/27.
 */
public class YamlConfigParseFactory implements ConfigParseFactory {
    @Override
    public ConfigParser createParser() {
        return new YamlConfigParser();
    }
}
