package com.cn.travel.base.dao;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author 47132
 */
public interface BaseDao<T> extends Mapper<T>,MySqlMapper<T> {

}
