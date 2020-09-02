# LearnSpring
学习spring相关内容

## BeanFactory工作原理

通过读取xml(或者注解)获取配置的内容唯一标识&全限定类名(key,value),然后反射创建对象.

简单的原理展示见[BeanFactory.java](https://github.com/lxzzzzzz/LearnSpring/blob/master/BeanFactory/src/main/java/cn/citynight/factory/BeanFactory.java)