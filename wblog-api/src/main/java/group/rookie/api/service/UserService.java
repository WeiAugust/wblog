package group.rookie.api.service;

import group.rookie.api.entity.User;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author wzg
 * @Date 2022/5/17 9:32
 * @Version 1.0
 **/
public interface UserService {
    User getUserById(long id);
}
