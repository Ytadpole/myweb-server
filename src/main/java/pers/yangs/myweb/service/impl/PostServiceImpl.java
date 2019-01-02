package pers.yangs.myweb.service.impl;

import pers.yangs.myweb.entity.Post;
import pers.yangs.myweb.mapper.PostMapper;
import pers.yangs.myweb.service.IPostService;
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
public class PostServiceImpl extends ServiceImpl<PostMapper, Post> implements IPostService {

}
