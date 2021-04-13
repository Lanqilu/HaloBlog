package com.halo.general.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.halo.base.enums.EPublish;
import com.halo.base.enums.EStatus;
import com.halo.base.global.BaseSQLConf;
import com.halo.base.servicelmpl.SuperServiceImpl;
import com.halo.commons.entity.Blog;
import com.halo.general.mapper.BlogMapper;
import com.halo.general.service.BlogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Halo
 * @date Created in 2021/04/13 9:22 PM
 * @description
 */
@Service
@Slf4j
public class BlogServiceImpl extends SuperServiceImpl<BlogMapper, Blog> implements BlogService {

    @Resource
    private BlogMapper blogMapper;
    @Override
    public Integer getBlogCount(Integer status) {
        QueryWrapper<Blog> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(BaseSQLConf.STATUS, EStatus.ENABLE);
        queryWrapper.eq(BaseSQLConf.IS_PUBLISH, EPublish.PUBLISH);
        return blogMapper.selectCount(queryWrapper);
    }

    @Override
    public String selectTitle(String id) {
        Blog blog = blogMapper.selectById(id);
        String title = blog.getTitle();
        return title;
    }
}
