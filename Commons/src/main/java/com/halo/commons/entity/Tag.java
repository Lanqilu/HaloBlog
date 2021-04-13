package com.halo.commons.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.halo.base.entity.SuperEntity;
import lombok.Data;

/**
 * @author Halo
 * @date Created in 2021/04/13 8:37 PM
 * @description 标签表
 */
@Data
@TableName("t_tag")
public class Tag extends SuperEntity<Tag> {

    private static final long serialVersionUID = 1L;

    /**
     * 标签内容
     */
    private String content;

    /**
     * 标签简介
     */
    private int clickCount;

    /**
     * 排序字段，数值越大，越靠前
     */
    private int sort;
}

