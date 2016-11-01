package web.newblog.dao;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.newblog.entity.User;

/**
 * Created by Administrator on 2016/11/1.
 */
@Repository
public class UserDaoImpl implements IUserDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void saveUser(User user) {
        this.sessionFactory.getCurrentSession().delete(user);
    }
}
