package Factory.FactoryMethod;

import Factory.ConfigParser;
import Factory.JsonConfigParser;

/**
 * Created by wangchaofan on 2020/10/27.
 */
public class JsonConfigParseFactory implements ConfigParseFactory {
    @Override
    public ConfigParser createParser() {
        return new JsonConfigParser();
    }
}
