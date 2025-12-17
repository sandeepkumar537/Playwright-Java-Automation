package com.uaf.playwright.config;

import lombok.experimental.UtilityClass;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@UtilityClass
public class ConfigReader {
    private static final Properties PROPS = loadProperties();

    private static Properties loadProperties() {
        Properties properties;

        try (InputStream inputStream = ConfigReader.class.getResourceAsStream("config/playwright.properties")) {

            if (inputStream == null) {
                throw new ConfigReaderException("playwright.properties not found.");
            }
            properties = new Properties();
            properties.load(inputStream);
        } catch (IOException exception) {
            throw new ConfigReaderException("Failed to load config" + exception.getMessage());
        }
        return properties;
    }


    public String getProperty(String key) {
        String envValue = System.getProperty(key);
        return envValue == null ? PROPS.getProperty(key) : envValue;
    }
}
