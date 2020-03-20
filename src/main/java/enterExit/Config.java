package enterExit;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;
import java.util.StringJoiner;

public class Config {
    private Properties properties;
    private final String path;
    private final Map<String, String> values = new HashMap<String, String>();

    public Config(final String path) {
        this.path = path;
    }

    public void load() throws IOException {
        properties = new Properties();
        FileInputStream in = new FileInputStream("app.properties");
        properties.load(in);
        for (String name : properties.stringPropertyNames()) {
            values.put(name, properties.getProperty(name));
        }


    }

    public String value(String key) {
        String s = properties.getProperty(key);
        return s;
    }

    @Override
    public String toString() {
        StringJoiner out = new StringJoiner(System.lineSeparator());
        try (BufferedReader read = new BufferedReader(new FileReader(this.path))) {
            read.lines().forEach(out::add);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return out.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Config("app.properties"));
    }
}

