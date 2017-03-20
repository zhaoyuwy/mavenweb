package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.impl.UserService;

/**
 * Created by Administrator on 2017/3/11.
 * zhaoyuwy@163.com
 */
public class TestCase {
    @Test

    public void test() {

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService us = (UserService) ac.getBean("userService");


        us.save();
        us.update();

    }
}
