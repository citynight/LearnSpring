package cn.citynight.factory;

import sun.misc.ExtensionInstallationException;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author logan
 * @date 2020/8/31 9:05 下午
 */

/**
 * @author logan
 * @date 2020/8/31 9:55 下午
 *
 * 1. 需要配置文件来配置我们的service和dao  配置的内容唯一标识=全限定类名（key = value）
 * 2. 通过读取配置文件中配置的内容，反射创建对象
 *
 * 这里使用properties，也可以使用xml
 */
public class BeanFactory {

    // 定义一个 Properties 对象
    private static Properties properties;

    // 定义一个Map,用于存放我们要创建的对象。我们把它称之为容器
    private static Map<String,Object> beans;

    //使用静态代码块为Properties对象赋值
    static {
        try {
            // 实例化对象
            properties = new Properties();

            // 获取properties文件的流对象
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("beans.properties");
            properties.load(in);

            // 实例化容器
            beans = new HashMap<String, Object>();

            // 取出配置文件中所有的key
            Enumeration<Object> keys = properties.keys();

            // 遍历枚举
            while (keys.hasMoreElements()) {
                // 取出每个key
                String key = keys.nextElement().toString();

                // 根据key获取value
                String beanPath = properties.getProperty(key);

                // 反射创建对象
                Object object = Class.forName(beanPath).newInstance();
                beans.put(key,object);
            }
        } catch (Exception e) {
            throw new ExceptionInInitializerError("初始化properties失败！");
        }
    }

    /**
     * @author logan
     * @date 2020/8/31 9:40 下午
     */
    public static Object getBean(String beanName) {
        return beans.get(beanName);
    }
}
