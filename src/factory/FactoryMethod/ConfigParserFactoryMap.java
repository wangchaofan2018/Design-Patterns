package factory.FactoryMethod;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangchaofan on 2020/10/28.
 */
public class ConfigParserFactoryMap {
    private static final Map<String, ConfigParserFactory> cachedFactories = new HashMap<>();

    static{
        cachedFactories.put("json", new JsonConfigParserFactory());
        cachedFactories.put("yaml", new YamlConfigParserFactory());
        cachedFactories.put("xml", new XmlConfigParserFactory());
    }

    public static ConfigParserFactory getParserFactory(String type) {
        if (type == null) {
            return null;
        }
        return cachedFactories.get(type);
    }
}
