package factory.AbstractFactory;

import factory.ConfigParser;

/**
 * Created by wangchaofan on 2020/10/28.
 */
public class JsonConfigParserFactory implements ConfigParserFactory {
    @Override
    public ConfigParser createNormalParser() {
        return new JsonNormalConfigParser();
    }

    @Override
    public ConfigParser createSystemParser() {
        return new JsonSystemConfigParser();
    }
}
