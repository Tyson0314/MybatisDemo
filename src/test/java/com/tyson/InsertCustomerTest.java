/**
 * Copyright (C), 2018-2019
 * FileName: InsertCustomerTest
 * Author:   Tyson
 * Date:     2019/1/30/0030 10:07
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson;

import com.tyson.mapper.CustomerMapper;
import com.tyson.pojo.Customer;
import com.tyson.util.SqlSessionFactoryUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author Tyson
 * @create 2019/1/30/0030 10:07
 * @since 1.0.0
 */
@Slf4j
public class InsertCustomerTest {
    @Test
    public void insertCustomer() {
        SqlSession session = null;
        try {
            session = SqlSessionFactoryUtil.openSqlSession();
            CustomerMapper customerMapper = session.getMapper(CustomerMapper.class);
            Customer customer = new Customer();
            customer.setName("tyson");
            customerMapper.insertCustomer(customer);
            session.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.rollback();
        } finally {
            if(session != null) {
                session.close();
            }
        }
    }
}