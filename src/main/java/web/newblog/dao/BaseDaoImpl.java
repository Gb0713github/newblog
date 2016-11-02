package web.newblog.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/11/1.
 */
@Repository
public class BaseDaoImpl<T> implements IBaseDao<T> {

    @Autowired
    private SessionFactory sessionFactory;

    /**
     * 获取当前的session
     * @return
     */
    private Session getCurrentSession(){
        return this.sessionFactory.getCurrentSession();
    }

    public void saveEntity(T entity) {
        this.getCurrentSession().save(entity);
    }

    public void deleteEntity(T entity){
        this.getCurrentSession().delete(entity);
    }
}
