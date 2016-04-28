package com.j2eedemo.daoimpl;

import com.j2eedemo.Util.HibernateUtil;
import com.j2eedemo.dao.BaseDAO;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by Administrator on 2016/4/28.
 */
public class BaseDAOImpl<E> implements BaseDAO<E> {

    @Override
    public void SaveOrUpdate(E VO) {
        Session session= HibernateUtil.getSession();
        Transaction tx=session.beginTransaction();
        try {
            session.saveOrUpdate(VO);
            tx.commit();
        }catch (Exception e){
            tx.rollback();
        }finally {
            session.close();
        }
    }

    @Override
    public E findById(int id) {
        return null;
    }

    @Override
    public void Delete(E VO) {
        Session session= HibernateUtil.getSession();
        Transaction tx=session.beginTransaction();
        try {
            session.delete(VO);
            tx.commit();
        }catch (Exception e){
            tx.rollback();
        }finally {
            session.close();
        }
    }
}
