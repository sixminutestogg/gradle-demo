package cn.com.zhang.dao.cn.com.zhang.dao.impl;

import cn.com.zhang.dao.AccountDao;

import java.util.List;

public class AccountDaoImpl implements AccountDao {
    @Override
    public List findAll() {
        System.out.println("列表返回成功！");
        return null;
    }
}
