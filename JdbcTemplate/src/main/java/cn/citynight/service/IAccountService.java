package cn.citynight.service;

import cn.citynight.domain.Account;

/**
 * @author logan
 * @date 2020/9/7 9:53 下午
 */
public interface IAccountService {
    /**
     * @description: 根据ID查询账户
     * @param:  * @param accountId
     * @return: cn.citynight.domain.Account
     * @author logan
     * @date: 2020/9/7 10:25 下午
     */
    Account findAccountById(Integer accountId);
    /**
     * @description: 转账
     * @param sourceName 转出账户名称
     * @param targetName 转入账户名称
     * @param money 转账金额
     * @return: void
     * @author logan
     * @date: 2020/9/7 10:26 下午
     */
    void transfer(String sourceName,String targetName,Float money);
}
