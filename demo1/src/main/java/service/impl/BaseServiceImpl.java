package service.impl;

import dao.BaseDao;
import service.BaseService;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/3/11.
 * zhaoyuwy@163.com
 */
public abstract  class BaseServiceImpl<T> implements BaseService<T> {
    private BaseDao<T> baseDao;



    @Resource

    public void setBaseDao(BaseDao<T> baseDao) {

        this.baseDao = baseDao;

    }



    @Override

    public void save() {

        // TODO Auto-generated method stub

        baseDao.save();

    }



    @Override

    public void update() {

        // TODO Auto-generated method stub

        baseDao.update();

    }
}
