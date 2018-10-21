package com.xxy.demo.service;

/**
 * Created by xiongxiaoyu
 * Data:2018/10/21
 * Time:16:38
 */

/**
 * Service层接口
 */
public interface AccountService {

    /**
     *
     * @param out   转出账号
     * @param in    转入账号
     * @param money 金额
     */
    public void transfer(String out, String in, Double money);
}
