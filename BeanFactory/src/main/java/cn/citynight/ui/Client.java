package cn.citynight.ui;

import cn.citynight.factory.BeanFactory;
import cn.citynight.service.IAccountService;

/**
 * @author logan
 * @date 2020/8/31 9:44 下午
 */
public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            IAccountService accountService = (IAccountService) BeanFactory.getBean("accountService");
            System.out.println(accountService);
            accountService.saveAccount();
        }
    }
}
