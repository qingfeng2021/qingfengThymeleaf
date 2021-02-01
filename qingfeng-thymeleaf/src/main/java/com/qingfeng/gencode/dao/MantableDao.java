package com.qingfeng.gencode.dao;

import com.qingfeng.base.dao.CrudDao;
import com.qingfeng.util.PageData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Title: MantableDao
 * @ProjectName qingfeng
 * @Description: MantableDao
 * @author anxingtao
 * @date 2020-9-22 22:42
 */
@Mapper
public interface MantableDao extends CrudDao<PageData> {

    /**
    * @Description: updateStatus
    * @Param: [pd]
    * @return: void
    * @Author: anxingtao
    * @Date: 2020-10-13 11:10
    */
    public void updateStatus(PageData pd);



    /**
    * @Description: findChildList
    * @Param: [pd]
    * @return: java.util.List<com.qingfeng.util.PageData>
    * @Author: anxingtao
    * @Date: 2020-10-13 11:10
    */
    public List<PageData> findChildList(PageData pd);

    /**
    * @Description: saveChild
    * @Param: [pd]
    * @return: int
    * @Author: anxingtao
    * @Date: 2020-10-13 11:10
    */
    public int saveChild(PageData pd);

    /**
    * @Description: updateChild
    * @Param: [pd]
    * @return: int
    * @Author: anxingtao
    * @Date: 2020-10-13 11:10
    */
    public int updateChild(PageData pd);

    /**
    * @Description: delChild
    * @Param: [pd]
    * @return: void
    * @Author: anxingtao
    * @Date: 2020-10-13 11:10
    */
    public void delChild(String[] ids);

    /**
    * @Description: delChildForPIds
    * @Param: [ids]
    * @return: void
    * @Author: anxingtao
    * @Date: 2020-10-13 11:10
    */
    public void delChildForPIds(String[] ids);



}
