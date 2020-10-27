package Factory.FactoryMethod;

import Factory.ConfigParser;
import Factory.RuleConfig;

/**
 * Created by wangchaofan on 2020/10/27.
 */
public class ConfigResource {
    public RuleConfig load(String path) {
        ConfigParseFactory parseFactory = null;
        String configStr = getFileExtension(path);
        if ("json".equals(configStr)) {
            parseFactory = new JsonConfigParseFactory();
        } else if ("xml".equals(configStr)) {
            parseFactory = new XmlConfigParseFactory();
        }
        ConfigParser parser = parseFactory.createParser();
        return parser.parse("");
    }

    private String getFileExtension(String path) {
        String[] arr = path.split(".");
        return arr[arr.length - 1];
    }
}
