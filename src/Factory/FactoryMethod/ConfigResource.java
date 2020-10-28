package factory.FactoryMethod;

import factory.ConfigParser;
import factory.RuleConfig;

/**
 * Created by wangchaofan on 2020/10/27.
 */
public class ConfigResource {
    public RuleConfig load(String path) {
//        //第一种方式
//        ConfigParseFactory parseFactory = null;
//        String configStr = getFileExtension(path);
//        if ("json".equals(configStr)) {
//            parseFactory = new JsonConfigParseFactory();
//        } else if ("xml".equals(configStr)) {
//            parseFactory = new XmlConfigParseFactory();
//        } else if ("yaml".equals(configStr)) {
//            parseFactory = new YamlConfigParseFactory();
//        }
//        ConfigParser parser = parseFactory.createParser();
//        return parser.parse("");

        //第二种方式
        ConfigParserFactory parserFactory = null;
        String type = getFileExtension(path);
        parserFactory = ConfigParserFactoryMap.getParserFactory(type);
        ConfigParser parser = parserFactory.createParser();
        return parser.parse("");
    }

    private String getFileExtension(String path) {
        String[] arr = path.split(".");
        return arr[arr.length - 1];
    }
}
