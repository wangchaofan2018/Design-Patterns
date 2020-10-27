package Factory.SimpleFactory;

import Factory.ConfigParser;
import Factory.JsonConfigParser;
import Factory.XmlConfigParser;
import Factory.YamlConfigParser;

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
