package com.qingfeng.base.dao;


import com.qingfeng.util.Page;
import com.qingfeng.util.PageData;

import java.util.List;

/**  
 * @Title: CrudDao
 * @ProjectName qingfeng
 * @Description: dao基础方法
 * @author anxingtao
 * @date 2020-9-22 21:04
 */
public interface CrudDao<T>{

    /** 
     * @Description: findListPage 分页信息查询 
     * @Param: [page] 
     * @return: java.util.List<T> 
     * @Author: anxingtao
     * @Date: 2020-9-22 21:05 
     */ 
    public List<T> findListPage(Page page);

    /** 
     * @Description: findListSize 分页总条数 
     * @Param: [page] 
     * @return: java.lang.Integer 
     * @Author: anxingtao
     * @Date: 2020-9-22 21:05 
     */ 
    public Integer findListSize(Page page);

    /** 
     * @Description: findList 列表信息查询 
     * @Param: [pd] 
     * @return: java.util.List<T> 
     * @Author: anxingtao
     * @Date: 2020-9-22 21:05 
     */ 
    public List<T> findList(PageData pd);

    /** 
     * @Description: findInfo 详情信息查询
     * @Param: [pd] 
     * @return: T 
     * @Author: anxingtao
     * @Date: 2020-9-22 21:05 
     */ 
    public T findInfo(PageData pd);

    /**
     * @Description: save 保存方法
     * @Param: [t]
     * @return: int
     * @Author: anxingtao
     * @Date: 2020-9-22 21:06
     */
    public int save(T t);

    /**
     * @Description: update 更新方法
     * @Param: [t]
     * @return: int
     * @Author: anxingtao
     * @Date: 2020-9-22 21:06
     */
    public int update(T t);

    /**
     * @Description: delForParam 根据对象删除
     * @Param: [pd]
     * @return: void
     * @Author: anxingtao
     * @Date: 2020-9-22 21:06
     */
    public void delForParam(PageData pd);

    /**
     * @Description: del 根据ids集合删除
     * @Param: [ids]
     * @return: void
     * @Author: anxingtao
     * @Date: 2020-9-22 21:06
     */
    public void del(String[] ids);

}
