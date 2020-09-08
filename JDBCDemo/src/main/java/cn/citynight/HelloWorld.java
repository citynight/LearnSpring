package cn.citynight;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author logan
 * @date 2020/8/30 11:02 下午
 */
@Component("hello")
public class HelloWorld {
    private String message;

    public HelloWorld() {
        this.setMessage("hehe");
    }

    public String getMessage() {
        System.out.println("Your Message : " + message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
