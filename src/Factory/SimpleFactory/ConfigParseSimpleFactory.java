package factory.SimpleFactory;

import factory.ConfigParser;
import factory.JsonConfigParser;
import factory.XmlConfigParser;
import factory.YamlConfigParser;

/**
 * Created by wangchaofan on 2020/10/26.
 */
public class ConfigParseSimpleFactory {
    public static ConfigParser createParser(String configStr) {
        ConfigParser parser = null;
        if ("json".equals(configStr)) {
            parser = new JsonConfigParser();
        } else if ("yaml".equals(configStr)) {
            parser = new YamlConfigParser();
        } else if ("xml".equals(configStr)) {
            parser = new XmlConfigParser();
        }else {
            throw new IllegalArgumentException();
        }
        return parser;
    }
}
