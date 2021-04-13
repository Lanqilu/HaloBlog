package com.halo.general.service;

import com.halo.base.servive.SuperService;
import com.halo.commons.entity.Blog;
import com.halo.general.vo.BlogVO;

/**
 * @author Halo
 * @date Created in 2021/04/13 9:09 PM
 * @description
 */
public interface BlogService extends SuperService<Blog> {

    Integer getBlogCount(Integer status);

    String selectTitle(String id);
}
