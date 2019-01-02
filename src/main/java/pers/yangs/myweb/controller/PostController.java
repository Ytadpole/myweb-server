package pers.yangs.myweb.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import pers.yangs.myweb.entity.Post;
import pers.yangs.myweb.service.IPostService;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yangs
 * @since 2019-01-02
 */
@RestController
@RequestMapping("post")
public class PostController {

    @Autowired
    private IPostService postService;

    @GetMapping("list")
    public List<Post> list(){
        return postService.list(null);
    }

    
}

