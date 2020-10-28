package factory.FactoryMethod;

import factory.ConfigParser;
import factory.XmlConfigParser;

/**
 * Created by wangchaofan on 2020/10/27.
 */
public class XmlConfigParserFactory implements ConfigParserFactory {
    @Override
    public ConfigParser createParser() {
        return new XmlConfigParser();
    }
}
