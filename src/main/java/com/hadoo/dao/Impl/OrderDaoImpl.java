package com.hadoo.dao.Impl;

        import com.hadoo.dao.OrderDao;
        import com.hadoo.entity.Order2;
        import lombok.Data;
        import org.hibernate.*;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Repository;

        import java.util.List;

/**
 * @Author : hadoo
 * @Date : 2020/5/12 15:16
 */
@Data
@Repository
public class OrderDaoImpl implements OrderDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void doCreateOrder(Order2 order) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        order.setO_status("未处理");
        session.save(order);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Order2> findAllOrders() {
        String hql = "from Order2";
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery(hql);
        List<Order2> list = query.list();
        transaction.commit();
        session.close();
        return list;
    }

    @Override
    public void updateOrder(Order2 order) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "update Order2 o set o.o_status='"+order.getO_status()+"' where id="+order.getId()+"";
        Query query = session.createQuery(hql);
        query.executeUpdate();
        transaction.commit();
        session.close();
    }

    @Override
    public void removeOrder(Order2 order) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(order);
        transaction.commit();
        session.close();
    }
}