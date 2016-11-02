package web.newblog.dao.userDao;

import org.springframework.stereotype.Repository;
import web.newblog.dao.BaseDaoImpl;
import web.newblog.entity.User;

/**
 * Created by Administrator on 2016/11/2.
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements IUserDao {
}
