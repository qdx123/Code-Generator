package com.zlinks.com.zlinks.controller;
import com.zlinks.com.zlinks.domain.LogLimitRecord;
import com.zlinks.com.zlinks.service.LogLimitRecordService;
import com.zlinks.common.web.BaseController;
import com.zlinks.common.web.JsonResult;
import com.zlinks.common.web.PageResult;
import com.zlinks.common.web.RestDoing;
import com.zlinks.Routes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;
/**
 * Copyright (C), 2017-2020, BBG
 * FileName: LogLimitRecordController
 * Author:   zhangjh
 * Date:     2018-7-9 16:30:11
 * Description: 控制层
 */
@RestController
@RequestMapping(value = Routes.API_VERSION)
public class LogLimitRecordController extends BaseController {

	/**
	 * logger 日志
	 */
    private Logger logger = LoggerFactory.getLogger(this.getClass());


	@Autowired
	private LogLimitRecordService logLimitRecordService;




	/**
     * @api {post} /logLimitRecords/save 01. LogLimitRecord删除
     * @apiPermission Login in Users
     * @apiGroup  LogLimitRecord
     * @apiVersion 1.0.1
	 * @apiParam {Number} id <code>必须参数</code> id
     * @apiSuccessExample {json} Success-Response:
     * HTTP/1.1 200 OK
     * {
     *     "code": 0,
     *     "data": 1
     *     "desc": "Success",
     *     "timestamp": "2018-7-9 16:30:11:082"
     * }
     * @apiErrorExample {json} Error-Response:
     * HTTP/1.1 200 OK
     * {
     *     "code": 110002,
     *     "desc": "Param is null or error",
     *     "timestamp": "2018-7-9 16:30:11:479"
     * }
     */
	@RequestMapping(value = "/logLimitRecords/delete/{id}", method = RequestMethod.DELETE)
	public JsonResult deleteJson(@PathVariable("id") int id) {
		RestDoing doing = jsonResult -> {

            int counts = logLimitRecordServiceImpl.delete(logLimitRecord);
            jsonResult.data = counts;
        };
        return doing.go(request, logger);
	}


	/**
	 * 详情页
	 *
	 * @param id 主键id
	 * @return String 详情页url
	 */
	@RequestMapping(value = "/logLimitRecords/info/{id}")
	public String info(@PathVariable("id") Long id) {

		RestDoing doing = jsonResult -> {

			LogLimitRecord entity  = logLimitRecordServiceImpl.queryInfoById(id);
            jsonResult.data = entity;
        };
        return doing.go(request, logger);
	}

	/**
	 * 列表页面
	 * 
	 * @param findContent 搜索内容
	 * @param pageNo 页数
	 * @return Pagination 集合列表
	 */
	@RequestMapping(value = "list")
	public String list(String findContent, ModelMap modelMap, Integer pageNo) {
		try {
			Pagination<LogLimitRecord> data = logLimitRecordService.findPage(modelMap, pageNo, pageSize);
			modelMap.addAttribute("data", data);
		} catch (Exception e) {
			logger.error(HPXSConstants.ERROR_STRING, e);
			redirect404();
		}
		return BASE_PATH + "list";
	}


	/**
     * @api {post} /logLimitRecords/save 01. LogLimitRecord新增
     * @apiPermission Login in Users
     * @apiGroup  LogLimitRecord
     * @apiVersion 1.0.1
	 * @apiParam {BigInteger} prop.propertyName <code>必须参数</code> LogLimitRecord的prop.propertyName
	 * @apiParam {Date} prop.propertyName <code>必须参数</code> LogLimitRecord的prop.propertyName
	 * @apiParam {String} prop.propertyName <code>必须参数</code> LogLimitRecord的prop.propertyName
	 * @apiParam {Date} prop.propertyName <code>必须参数</code> LogLimitRecord的prop.propertyName
	 * @apiParam {BigInteger} prop.propertyName <code>必须参数</code> LogLimitRecord的prop.propertyName
	 * @apiParam {String} prop.propertyName <code>必须参数</code> LogLimitRecord的prop.propertyName
	 * @apiParam {String} prop.propertyName <code>必须参数</code> LogLimitRecord的prop.propertyName
	 * @apiParam {String} prop.propertyName <code>必须参数</code> LogLimitRecord的prop.propertyName
	 * @apiParam {String} prop.propertyName <code>必须参数</code> LogLimitRecord的prop.propertyName
	 * @apiParam {String} prop.propertyName <code>必须参数</code> LogLimitRecord的prop.propertyName
	 * @apiParam {String} prop.propertyName <code>必须参数</code> LogLimitRecord的prop.propertyName
	 * @apiParam {String} prop.propertyName <code>必须参数</code> LogLimitRecord的prop.propertyName
     * @apiSuccessExample {json} Success-Response:
     * HTTP/1.1 200 OK
     * {
     *     "code": 0,
     *     "data": 1
     *     "desc": "Success",
     *     "timestamp": "2018-7-9 16:30:11:082"
     * }
     * @apiErrorExample {json} Error-Response:
     * HTTP/1.1 200 OK
     * {
     *     "code": 110002,
     *     "desc": "Param is null or error",
     *     "timestamp": "2018-7-9 16:30:11:479"
     * }
     */
	@RequestMapping(value = "/logLimitRecords/save", method = RequestMethod.POST)
	public JsonResult add(@RequestBody LogLimitRecord logLimitRecord) {

  		RestDoing doing = jsonResult -> {

            int counts = logLimitRecordServiceImpl.add(logLimitRecord);
            jsonResult.data = counts;
        };
        return doing.go(request, logger);
	}


	/**
	 * 列表数据
	 * 
	 * @param findContent 搜索内容
	 * @param pageNo 页数
	 * @return Pagination 集合列表
	 */
	@RequestMapping(value = "jsonList")
	@ResponseBody
	public JsonResult<Pagination<LogLimitRecord>> jsonList(String findContent, ModelMap modelMap, Integer pageNo) {
		JsonResult<Pagination<LogLimitRecord>> result = new JsonResult<Pagination<LogLimitRecord>>();
		try {
			Pagination<LogLimitRecord> data = logLimitRecordService.findPage(modelMap, pageNo, pageSize);
			result.setData(data);
		} catch (Exception e) {
			logger.error(HPXSConstants.ERROR_STRING, e);
			result.setCode(HPXSConstants.STATUS_ERROR);
			result.setMessage(e.getMessage());
			result.setSuccess(Boolean.FALSE);
		}
		return result;
	}

}
