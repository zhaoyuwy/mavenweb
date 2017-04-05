package com.ceshi.dao.impl;

import org.springframework.stereotype.Repository;
import com.ceshi.session.User;

/**
 * Created by Administrator on 2017/3/11.
 * zhaoyuwy@163.com
 */

@Repository("userDao")
public class UserDaoImpl  extends BaseDaoImpl<User> {
    public static void main(String[] arg){
        System.out.println("this is a text");
    }
}
