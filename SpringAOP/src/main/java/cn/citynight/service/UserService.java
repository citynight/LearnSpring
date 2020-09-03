package cn.citynight.service;

import org.springframework.stereotype.Service;

/**
 * @author logan
 * @date 2020/9/3 11:48 下午
 */
@Service
public class UserService {

    public Integer multiply(int a, int b){
        int res = a*b;
        System.out.println(a+ "*" + b +"= " + res);
        return res;
    }
}
