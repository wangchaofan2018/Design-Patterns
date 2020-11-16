package factory.FactoryMethod;

import factory.ConfigParser;
import factory.JsonConfigParser;

/**
 * Created by wangchaofan on 2020/10/27.
 */
public class JsonConfigParserFactory implements ConfigParserFactory {
    @Override
    public ConfigParser createParser() {
        return new JsonConfigParser();
    }
}
