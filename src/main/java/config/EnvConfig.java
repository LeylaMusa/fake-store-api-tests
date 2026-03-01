package config;

public class EnvConfig {
        public static String baseUrl() {
            return System.getProperty("baseUrl", "https://fakestoreapi.com");
        }
    }


