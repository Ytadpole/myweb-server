package pers.yangs.myweb.service;

import pers.yangs.myweb.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yangs
 * @since 2019-01-02
 */
public interface IUserService extends IService<User> {

    public User getUserByName(String name);
}
