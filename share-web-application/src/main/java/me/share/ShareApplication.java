package me.share;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 启动
 * @author dingxiaotao
 * @since 2020/05/14
 */
@SpringBootApplication(scanBasePackages = "me.share")
public class ShareApplication extends SpringBootServletInitializer {
    public static void main (String[] args) {
        SpringApplication.run(ShareApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }
}
