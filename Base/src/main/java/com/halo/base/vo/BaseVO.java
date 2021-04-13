package com.halo.base.vo;

import lombok.Data;

/**
 * @author Halo
 * @date Created in 2021/04/13 8:12 PM
 * @description BaseVO   view object 表现层 基类对象
 */
@Data
public class BaseVO<T> extends PageInfoVO<T> {
    /**
     * 唯一UID
     */
    private String uid;

    private Integer status;
}
