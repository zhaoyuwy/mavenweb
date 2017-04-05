package com.ceshi.service.impl;

import com.ceshi.dao.BaseDao;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Service;
import com.ceshi.session.User;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/3/11.
 * zhaoyuwy@163.com
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    // Define a static logger variable so that it references the
    // Logger instance named "MyApp".
    private static final Logger logger = LogManager.getLogger(UserServiceImpl.class);
    @Resource(name="userDao")


    public void setBaseDao(BaseDao<User> baseDao) {

        // TODO Auto-generated method stub
        logger.error("this is a info");
        super.setBaseDao(baseDao);

    }
}
