package oop.homework3.singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    private final Map<String, String> configs;

    // Why private? Prevents creating instances from outside, enforcing a single instance.
    private ConfigManager() {
        this.configs = new HashMap<>();
    }

    // Why static? Allows access without an existing object; returns the one global instance.
    public static ConfigManager getInstance() {
        return ConfigHolder.INSTANCE;
    }

    // Thread safety: JVM class initialization is thread-safe, so INSTANCE is created safely and lazily.
    private static class ConfigHolder {
        private static final ConfigManager INSTANCE = new ConfigManager();
    }

    public void setConfig(String key, String value) {
        configs.put(key, value);
    }

    public String getConfig(String key) {
        return configs.get(key);
    }

    public void displayAllConfigs() {
        for (Map.Entry<String, String> entry : configs.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}


