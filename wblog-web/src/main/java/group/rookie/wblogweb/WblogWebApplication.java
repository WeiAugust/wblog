package group.rookie.wblogweb;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@DubboComponentScan(basePackages = {"group.rookie.wblogweb"})
public class WblogWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WblogWebApplication.class, args);
	}

}
