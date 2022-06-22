package group.rookie;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Generator
 * @Description TODO
 * @Author wzg
 * @Date 2022/5/17 19:35
 * @Version 1.0
 **/
public class Generator {

    public static void main(String[] args) {
        try {
            List<String> warnings = new ArrayList<>();
            boolean overwrite = true;
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            InputStream inputStream = classLoader.getResourceAsStream("generatorConfig.xml");
            ConfigurationParser configurationParser = new ConfigurationParser(warnings);
            Configuration config = configurationParser.parseConfiguration(inputStream);
            DefaultShellCallback defaultShellCallback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, defaultShellCallback, warnings);
            myBatisGenerator.generate(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
