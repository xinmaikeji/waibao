package xinmai.game.service.impl;

import org.springframework.stereotype.Service;
import xinmai.game.dao.IUserDao;
import xinmai.game.model.User;
import xinmai.game.service.IUserService;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }

}
