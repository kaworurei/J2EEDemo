package com.j2eedemo.dao;

/**
 * Created by Administrator on 2016/4/28.
 */
public interface BaseDAO<E> {
    void SaveOrUpdate(E VO);
    E findById(int id);
    void Delete(E VO);
}
