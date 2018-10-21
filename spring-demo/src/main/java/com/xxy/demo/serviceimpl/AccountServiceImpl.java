package com.xxy.demo.serviceimpl;


import com.xxy.demo.dao.AccountDao;
import com.xxy.demo.service.AccountService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by xiongxiaoyu
 * Data:2018/10/21
 * Time:16:38
 */

@Transactional(propagation = Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService {

    //注入转账Dao

    private AccountDao accountDao;


    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    /**
     *
     * @param out   转出账号
     * @param in    转入账号
     * @param money 金额
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED,readOnly = false)
    public void transfer(String out, String in, Double money) {
        accountDao.outMoney(out,money);
//        int i = 1/0;
        accountDao.inMoney(in,money);

    }
}
