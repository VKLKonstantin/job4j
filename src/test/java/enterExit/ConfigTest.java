package enterExit;

import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class ConfigTest {
    @Test
    public void whenPairWithoutComment() throws IOException {
        String path = "app.properties";
        Config config = new Config(path);
        config.load();
        assertThat(
                config.value("name"),
                is("Konstantin")
        );
    }
}