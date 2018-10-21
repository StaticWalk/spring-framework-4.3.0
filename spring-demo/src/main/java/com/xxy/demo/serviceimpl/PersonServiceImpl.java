package com.xxy.demo.serviceimpl;


import com.xxy.demo.dao.PersonDao;
import com.xxy.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by xiongxiaoyu
 * Data:2018/10/21
 * Time:16:38
 */
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    public PersonDao getPersonDao() {
        return personDao;
    }

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public void savePerson() {
        this.personDao.savePerson();
    }

    @Override
    public void updatePerson() {
        this.personDao.updatePerson();
    }
}
