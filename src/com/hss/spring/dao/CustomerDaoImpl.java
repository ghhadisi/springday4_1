package com.hss.spring.dao;

import com.hss.spring.domain.Customer;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {
    @Override
    public void save(Customer customer) {
        System.out.println("CustomerDaoImpl中的save方法执行了...");

        this.getHibernateTemplate().save(customer);
    }
}
