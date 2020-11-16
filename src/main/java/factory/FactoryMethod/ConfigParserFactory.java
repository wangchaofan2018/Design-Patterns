package factory.FactoryMethod;

import factory.ConfigParser;

/**
 * Created by wangchaofan on 2020/10/27.
 */
public interface ConfigParserFactory {
    ConfigParser createParser();
}
