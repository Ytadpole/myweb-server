package pers.yangs.myweb.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import pers.yangs.myweb.entity.User;
import pers.yangs.myweb.mapper.UserMapper;
import pers.yangs.myweb.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yangs
 * @since 2019-01-02
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public User getUserByName(String name) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("user_name", name);
        return this.getOne(wrapper);
    }
}
