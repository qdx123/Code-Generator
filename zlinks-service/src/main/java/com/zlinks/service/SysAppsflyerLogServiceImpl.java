package com.zlinks.zlinks-service/src/main/java/com/zlinks/service/.impl;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import com.zlinks.zlinks-repository/src/main/java/com/zlinks/domain/.SysAppsflyerLog;
import com.zlinks.zlinks-service/src/main/java/com/zlinks/service/.SysAppsflyerLogService;
import com.zlinks.zlinks-repository/src/main/java/com/zlinks/mapper/.SysAppsflyerLogDao;
import java.util.List;
import java.util.Map;

import com.hpxs.base.BaseMybatisDao;
import com.zlinks.core.mybatis.page.Pagination;

/**
 * Copyright (C), 2017-2020, BBG
 * FileName: AccountController
 * Author:   zhangjh
 * Date:     2018-7-9 16:02:01
 * Description:业务
 */
@Service("sysAppsflyerLogService")
public class SysAppsflyerLogServiceImpl extends BaseMybatisDao<SysAppsflyerLogDao> implements SysAppsflyerLogService {

	@Autowired
	private SysAppsflyerLogDao sysAppsflyerLogDao;

	@Override
	public SysAppsflyerLog getById(int id) {
		return sysAppsflyerLogDao.getById(id);
	}

	@Override
	public int getListCount(SysAppsflyerLog entity) {
		return sysAppsflyerLogDao.getListCount(entity);
	}

	@Override
	public List<SysAppsflyerLog> getList(SysAppsflyerLog entity) {
		List<SysAppsflyerLog> resut = null;
		resut = sysAppsflyerLogDao.getList(entity);
		return resut;
	}

	@Override
	public int getListByMapCount(Map<String, Object> paramMap) {
		return sysAppsflyerLogDao.getListByMapCount(paramMap);
	}

	@Override
	public List<SysAppsflyerLog> getListByMap(Map<String, Object> paramMap) {
		List<SysAppsflyerLog> resut = null;
		resut = sysAppsflyerLogDao.getListByMap(paramMap);
		return resut;
	}

	@Override
    @Transactional(rollbackFor = Exception.class)
	public int update(SysAppsflyerLog entity) {
		return sysAppsflyerLogDao.update(entity);
	}

	@Override
    @Transactional(rollbackFor = Exception.class)
	public int deleteById(int id) {
		return sysAppsflyerLogDao.deleteById(id);
	}

	@Override
    @Transactional(rollbackFor = Exception.class)
	public int add(SysAppsflyerLog entity) {
		return sysAppsflyerLogDao.add(entity);
	}

	@Override
    @Transactional(rollbackFor = Exception.class)
	public int addList(List<SysAppsflyerLog> entityList) {
		return sysAppsflyerLogDao.addList(entityList);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Pagination<SysAppsflyerLog> findPage(Map<String,Object> paramMap, Integer pageNo,
			Integer pageSize) {
		return super.findPage(paramMap, pageNo, pageSize);
	}

	@Override
	public List<SysAppsflyerLog> getActivedList() {
		List<SysAppsflyerLog> resut = null;
		SysAppsflyerLog entity = new SysAppsflyerLog();
		entity.setIsDeleted(0);
		resut = sysAppsflyerLogDao.getList(entity);
		return resut;
	}
}