package service.impl;

import dao.BaseDao;
import org.springframework.stereotype.Service;
import session.User;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/3/11.
 * zhaoyuwy@163.com
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
    @Resource(name="userDao")

    public void setBaseDao(BaseDao<User> baseDao) {

        // TODO Auto-generated method stub

        super.setBaseDao(baseDao);

    }
}
