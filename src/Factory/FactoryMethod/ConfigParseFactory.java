package Factory.FactoryMethod;

import Factory.ConfigParser;

/**
 * Created by wangchaofan on 2020/10/27.
 */
public interface ConfigParseFactory {
    ConfigParser createParser();
}
