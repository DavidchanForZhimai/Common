package com.david.dao;

import com.david.entity.SysConfigEntity;
import org.apache.ibatis.annotations.Param;

/**
 * 系统配置信息
 *
 * Created by chendawei on 2017/6/6.
 */
public interface SysConfigDao extends BaseDao<SysConfigEntity> {
	
	/**
	 * 根据key，查询value
	 */
	String queryByKey(String paramKey);
	
	/**
	 * 根据key，更新value
	 */
	int updateValueByKey(@Param("key") String key, @Param("value") String value);
	
}
