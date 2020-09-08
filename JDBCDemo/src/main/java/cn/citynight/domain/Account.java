package cn.citynight.domain;

import java.io.Serializable;

/**
 * @author logan
 * @date 2020/9/1 7:35 下午
 */

/**
 * @description: 账户的实体类
 * @author logan
 * @date: 2020/9/1 7:37 下午
 */
public class Account implements Serializable {

    private Integer id;
    private String name;
    private Float money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
