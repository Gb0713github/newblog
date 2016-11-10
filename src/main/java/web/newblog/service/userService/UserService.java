package web.newblog.service.userService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.newblog.dao.userDao.IUserDao;
import web.newblog.entity.User;

/**
 * Created by Administrator on 2016/11/1.
 */
@Service
@Transactional
public class UserService implements IUserService {

    @Autowired
    private IUserDao userDao;

    public String getAllUser() {
        User user = new User();
        return "aa";
    }
}
