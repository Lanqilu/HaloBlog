package com.halo.admin.api;


import com.halo.base.exception.ThrowableUtils;
import com.halo.general.mapper.BlogMapper;
import com.halo.general.service.BlogService;
import com.halo.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

/**
 * @author Halo
 * @date Created in 2021/04/13 8:42 PM
 * @description 博客相关API
 */
@RestController
@RequestMapping("/blog")
@Api(value = "博客相关接口", tags = {"博客相关接口"})
@Slf4j
public class BlogApi {

    @Autowired
    public BlogService blogService;

    //    @AuthorityVerify
    @ApiOperation(value = "获取博客数量", notes = "获取博客数量", response = String.class)
    @GetMapping("/getCount")
    public String getCount(@RequestBody Integer status, BindingResult result) {
        ThrowableUtils.checkParamArgument(result);
        System.out.println(status);
        return ResultUtil.successWithData(blogService.getBlogCount(status));
    }

    @ApiOperation(value = "获取博客标题", notes = "获取博客标题", response = String.class)
    @GetMapping("Hello/{id}")
    public String hello(@PathVariable String id) {
        String title = blogService.selectTitle(id);
        return title;
    }
}
