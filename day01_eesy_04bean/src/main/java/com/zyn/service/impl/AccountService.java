package com.zyn.service.impl;

import com.zyn.service.IAccountService;

public class AccountService implements IAccountService {
    public AccountService() {
        System.out.println("对象创建了");
    }
    public void saveAccount() {
        System.out.println("service的saveAccount方法执行了");
    }
}
