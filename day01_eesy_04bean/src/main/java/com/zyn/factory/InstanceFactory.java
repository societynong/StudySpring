package com.zyn.factory;

import com.zyn.service.IAccountService;
import com.zyn.service.impl.AccountService;

/*
* 模拟一个工厂类 该类可能存在于jar包中
* */
public class InstanceFactory {
    public IAccountService getAccountService() {
        return new AccountService();
    }
}
