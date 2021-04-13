package com.halo.base.servicelmpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.halo.base.mapper.SuperMapper;
import com.halo.base.servive.SuperService;

/**
 * @author Halo
 * @date Created in 2021/04/13 9:27 PM
 * @description SuperService 实现类（ 泛型：M 是  mapper(dao) 对象，T 是实体 ）
 */
public class SuperServiceImpl<M extends SuperMapper<T>, T> extends ServiceImpl<M, T> implements SuperService<T> {

}
