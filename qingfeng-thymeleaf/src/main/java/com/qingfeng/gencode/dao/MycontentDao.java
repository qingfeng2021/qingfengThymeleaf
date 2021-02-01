package com.qingfeng.gencode.dao;

import com.qingfeng.base.dao.CrudDao;
import com.qingfeng.util.PageData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Title: MycontentDao
 * @ProjectName qingfeng
 * @Description: MycontentDao
 * @author anxingtao
 * @date 2020-9-22 22:42
 */
@Mapper
public interface MycontentDao extends CrudDao<PageData> {

    /**
    * @Description: updateStatus
    * @Param: [pd]
    * @return: void
    * @Author: anxingtao
    * @Date: 2020-10-13 11:10
    */
    public void updateStatus(PageData pd);




}
