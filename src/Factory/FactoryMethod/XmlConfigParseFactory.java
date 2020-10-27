package Factory.FactoryMethod;

import Factory.ConfigParser;
import Factory.XmlConfigParser;

/**
 * Created by wangchaofan on 2020/10/27.
 */
public class XmlConfigParseFactory implements ConfigParseFactory {
    @Override
    public ConfigParser createParser() {
        return new XmlConfigParser();
    }
}
