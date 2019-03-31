package com.hss.spring.service;

import com.hss.spring.dao.CustomerDao;
import com.hss.spring.domain.Customer;
import org.springframework.transaction.annotation.Transactional;

/**
 * 客户管理的业务层的实现类
 */
@Transactional
public class CustomerServiceImpl implements CustomerService {

    private  CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void save(Customer customer) {
        System.out.println("Service中的save方法执行了...");
        customerDao.save(customer);
    }
}
