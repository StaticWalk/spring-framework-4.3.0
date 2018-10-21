package com.xxy.demo.impl;



/**
 * Created by xiongxiaoyu
 * Data:2018/10/21
 * Time:16:38
 */

import com.xxy.demo.dao.AccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 *  接口实现类
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

    public void outMoney(String out, Double money) {
        String sql = "update account set money = money - ? where name = ?";
        this.getJdbcTemplate().update(sql,money,out);
    }

    public void inMoney(String in, Double money) {
        String sql = "update account set money = money + ? where name = ?";
        this.getJdbcTemplate().update(sql,money,in);
    }
}
