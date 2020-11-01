package factory.AbstractFactory;

import factory.ConfigParser;

/**
 * Created by wangchaofan on 2020/10/28.
 */
public interface ConfigParserFactory {
    ConfigParser createNormalParser();

    ConfigParser createSystemParser();
}
