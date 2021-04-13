package com.halo.base.vo;

import lombok.Data;
import lombok.ToString;

/**
 * @author Halo
 * @date Created in 2021/04/13 8:14 PM
 * @description 用于分页
 */
@Data
@ToString
public class PageInfoVO<T> {

    /**
     * 关键字
     */
    private String keyword;

    /**
     * 当前页
     */
    private Long currentPage;

    /**
     * 页大小
     */
    private Long pageSize;
}
