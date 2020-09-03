package cn.citynight.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author logan
 * @date 2020/9/3 11:42 下午
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "cn.citynight")
public class AspectConfig {
}
