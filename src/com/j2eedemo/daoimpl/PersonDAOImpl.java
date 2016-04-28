package com.j2eedemo.daoimpl;

import com.j2eedemo.Util.HibernateUtil;
import com.j2eedemo.dao.BaseDAO;
import com.j2eedemo.dao.PersonDAO;
import com.j2eedemo.vo.PersonVO;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by Administrator on 2016/4/28.
 */
public class PersonDAOImpl extends BaseDAOImpl<PersonVO> implements PersonDAO{
    @Override
    public PersonVO findById(int id) {
        PersonVO person = null;
        Session session= HibernateUtil.getSession();
        Transaction tx=session.beginTransaction();
        try {
            person= (PersonVO) session.get(PersonVO.class,id);
            tx.commit();
        }catch (Exception e){
            tx.rollback();
        }finally {
            session.close();
        }
        return person;
    }
}
