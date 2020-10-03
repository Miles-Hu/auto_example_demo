package com.freeperch.auto.example.dao;


import com.freeperch.auto.example.entity.Resource;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author hujun
 * @email miles.j.hoo@gmail.com
 * @date 2019-06-03 17:42
 */
@Repository
public interface ResourceMapper extends Mapper<Resource> {
}
