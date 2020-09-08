package cn.citynight.config;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * @author logan
 * @date 2020/9/7 10:41 下午
 */
public class TransactionConfig {

    @Bean(name = "transactionManager")
    public PlatformTransactionManager creatTransactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}
