package com.xxy.demo.springtest;


import com.xxy.demo.service.AccountService;

import javax.annotation.Resource;

/**
 * Created by huangguoxin on 16/1/24.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:applicationContext.xml")
public class AccountTest {

    @Resource(name = "accountService")
    private AccountService accountService;

//    @Test
    public void AccountDemo(){
        accountService.transfer("aaa","bbb",200d);
    }
}
