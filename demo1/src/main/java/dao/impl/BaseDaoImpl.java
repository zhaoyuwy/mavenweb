package dao.impl;

import dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import session.Session;

/**
 * Created by Administrator on 2017/3/11.
 * zhaoyuwy@163.com
 */
public abstract class BaseDaoImpl<T> implements BaseDao<T> {
    @Autowired
    private Session session;

    @Override
    public void save() {
        session.save();
    }
    @Override
    public void update() {
        session.update();
    }
}
