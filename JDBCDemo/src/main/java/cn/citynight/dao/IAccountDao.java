package cn.citynight.dao;

import cn.citynight.domain.Account;

import java.util.List;

/**
 * @author logan
 * @date 2020/9/1 7:33 下午
 */
public interface IAccountDao {
    /**
     * 查询所有
     */
    List<Account> findAllAccount();

    Account findAccountById(Integer accountId);

    void saveAccount(Account account);

    void updateAccount(Account account);

    void deleteAccount(Integer accountId);
}
