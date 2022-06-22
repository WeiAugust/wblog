package group.rookie.dbservice.impl;

import group.rookie.dbservice.dao.UserMapper;
import group.rookie.api.entity.User;
import group.rookie.api.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author wzg
 * @Date 2022/5/17 9:33
 * @Version 1.0
 **/
@DubboService
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
