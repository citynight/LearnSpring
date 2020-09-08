package cn.citynight.dao;

import cn.citynight.domain.Account;

/**
 * @author logan
 * @date 2020/9/7 9:54 下午
 */
public interface IAccountDao {
    /**
     * @description:  根据ID查询账户
     * @param:  * @param accountId
     * @return: cn.citynight.domain.Account
     * @author logan
     * @date: 2020/9/7 9:59 下午
     */
    Account findAccountById(Integer accountId);

    /**
     * @description: 根据名称查询账户
     * @param: accountName
     * @return: cn.citynight.domain.Account
     * @author logan
     * @date: 2020/9/7 10:02 下午
     */
    Account findAccountByName(String accountName);

    /**
     * @description: 跟新账户
     * @param: account
     * @return: void
     * @author logan
     * @date: 2020/9/7 10:02 下午
     */
    void updateAccount(Account account);
}
