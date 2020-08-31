package cn.citynight.service.impl;

import cn.citynight.dao.IAccountDao;
import cn.citynight.factory.BeanFactory;
import cn.citynight.service.IAccountService;

/**
 * @author logan
 * @date 2020/8/31 9:04 下午
 */
public class AccountServiceImpl implements IAccountService {

private IAccountDao accountDao = (IAccountDao) BeanFactory.getBean("accountDao");
    public void saveAccount() {
        int i = 1;
        accountDao.saveAccount();
        System.out.println(i);
        i++;
    }
}
