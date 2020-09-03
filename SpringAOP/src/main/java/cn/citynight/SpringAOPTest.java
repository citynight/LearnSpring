package cn.citynight;

import cn.citynight.config.AspectConfig;
import cn.citynight.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author logan
 * @date 2020/9/3 11:55 下午
 */
public class SpringAOPTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AspectConfig.class);
        context.refresh();
        UserService bean = context.getBean(UserService.class);
        bean.multiply(2,3);

    }
}
