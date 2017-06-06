package com.david.service;

import com.david.entity.SysLogEntity;

import java.util.List;
import java.util.Map;

/**
 * 系统日志
 *
 * Created by chendawei on 2017/6/6.
 */
public interface SysLogService {
	
	SysLogEntity queryObject(Long id);
	
	List<SysLogEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SysLogEntity sysLog);
	
	void update(SysLogEntity sysLog);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
