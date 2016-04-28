package com.j2eedemo.daoimpl;

import com.j2eedemo.Util.HibernateUtil;
import com.j2eedemo.dao.ShopDAO;
import com.j2eedemo.vo.ShopVO;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by Administrator on 2016/4/28.
 */
public class ShopDAOImpl extends BaseDAOImpl<ShopVO> implements ShopDAO {
    @Override
    public ShopVO findById(int id) {
        ShopVO shop = null;
        Session session= HibernateUtil.getSession();
        Transaction tx=session.beginTransaction();
        try {
            shop= (ShopVO) session.get(ShopVO.class,id);
            tx.commit();
        }catch (Exception e){
            tx.rollback();
        }finally {
            session.close();
        }
        return shop;
    }
}
