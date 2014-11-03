package controller.manager;

import java.util.ResourceBundle;

/**
 * Created by user on 31.10.2014.
 */
public class ConfigurationManager {
    private final static ResourceBundle resourceBundle=
            ResourceBundle.getBundle("config");
    // класс извлекает информацию из файла config.properties
    private ConfigurationManager() { }
    public static String getProperty(String key) {
        return resourceBundle.getString(key);
    }
}
