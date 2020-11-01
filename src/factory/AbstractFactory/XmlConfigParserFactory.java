package factory.AbstractFactory;

import factory.ConfigParser;

/**
 * Created by wangchaofan on 2020/10/28.
 */
public class XmlConfigParserFactory implements ConfigParserFactory {
    @Override
    public ConfigParser createNormalParser() {
        return new XmlNormalConfigParser();
    }

    @Override
    public ConfigParser createSystemParser() {
        return new XmlSystemConfigParser();
    }
}
