package cn.citynight.service.impl;

import cn.citynight.dao.IAccountDao;
import cn.citynight.domain.Account;
import cn.citynight.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author logan
 * @date 2020/9/1 7:57 下午
 */

@Service("accountService")
public class AccountServiceImpl implements IAccountService {


    @Autowired
    private IAccountDao accountDao;


    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    public Account findAccountById(Integer accountId) {
        return accountDao.findAccountById(accountId);
    }

    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    public void deleteAccount(Integer accountId) {
        accountDao.deleteAccount(accountId);
    }
}
