package Factory.SimpleFactory;

import Factory.ConfigParser;
import Factory.RuleConfig;

import java.util.regex.Pattern;

/**
 * Created by wangchaofan on 2020/10/27.
 */
public class ConfigResource {
    public RuleConfig load(String filePath) {
        String configStr = getFileExtension(filePath);
        ConfigParser parser = ConfigParseSimpleFactory.createParser(configStr);
        String text = "";
        RuleConfig config = parser.parse(text);
        return config;
    }

    private String getFileExtension(String path) {
        String[] arr = path.split(".");
        return arr[arr.length - 1];
    }
}
