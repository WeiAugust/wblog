package group.rookie.service.impl;

import group.rookie.entity.User;
import group.rookie.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author wzg
 * @Date 2022/5/17 9:33
 * @Version 1.0
 **/
@DubboService
public class UserServiceImpl implements UserService {
    @Override
    public User getUserById(String id) {
        User user = User.builder().userId(123L).userName("wzg").build();
        return user;
    }
}
