package main.java.design_pattern.creational.tp;

import java.util.HashMap;
import java.util.Map;

public class Configuration {
    private static Configuration instances;

    private static Map<String, String> settings = new HashMap<>();

    private Configuration() {}

    public static  Configuration getInstance() {
        if (instances == null) {
            instances = new Configuration();
        }
        return instances;
    }

    public static String getSetting(String key) {
        return settings.get(key);
    }

    public static void setSetting(String key, String value) {
        settings.put(key, value);
    }
}