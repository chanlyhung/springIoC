package com.chuang.service;

import com.chuang.dao.AccountDao;

import javax.swing.text.ParagraphView;

/**
 * @author chuang
 * @date 2020/04/13 - 20:00
 */
public class AccountService {

    AccountDao dao = new AccountDao();

    public void doSevice(){
        dao.save();
    }

}
