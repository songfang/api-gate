package com.ruoyi.common.base.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * generator生成的xml方式mapper
* <p>Title: XmlMapper</p>  
* <p>Description: </p>  
* @author chenyang  
* @date 2018年11月29日
 */
public interface XmlMapper <T extends BaseEntity> {
	int countByExample(Object example);

    int deleteByExample(Object example);

    int deleteByPrimaryKey(Object id);

    int insert(T record);

    int insertSelective(T record);

    List<T> selectByExample(Object example);

    T selectByPrimaryKey(Object id);

    int updateByExampleSelective(@Param("record") T record, @Param("example") Object example);

    int updateByExample(@Param("record") T record, @Param("example") Object example);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
