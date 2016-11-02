package web.newblog.dao;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/11/1.
 */
public interface IBaseDao<T> {

    /**
     * 保存实体
     * @param entity
     */
    public void saveEntity(T entity);

    /**
     * 删除实体
     * @param entity
     */
    public void deleteEntity(T entity);
}