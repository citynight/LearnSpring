package cn.citynight;

import java.sql.*;

/**
 * @author logan
 * @date 2020/8/25 11:33 下午
 *
 * 程序耦合: 程序之间存在依赖关系
 *      包括: 类之间的关系/方法之间的关系
 *
 * 解耦:
 *      降低程序间的依赖关系
 * 实际开发中:
 *      应该做到:编译期不依赖,运行时才依赖
 * 解耦思路:
 *      第一步: 使用反射来创建对象
 *      第二步: 通过读取配置文件来获取要创建的对应全限定类名
 *
 *
 * 解耦:
 *
 */
public class JdbcDemo {
    public static void main(String[] args) throws Exception {
        // 1. 注册驱动
//        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//        Class.forName("com.mysql.jdbc.Driver");
        // 2. 获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","12345678");
        // 3. 获取数据库预处理对象
        PreparedStatement preparedStatement = connection.prepareStatement("select * from account");
        // 4. 执行SQL,得到结果集
        ResultSet resultSet = preparedStatement.executeQuery();
        // 5. 遍历结果集
        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }
        // 6. 释放资源
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
