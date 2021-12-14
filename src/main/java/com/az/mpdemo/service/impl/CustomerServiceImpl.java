package com.az.mpdemo.service.impl;

import com.az.mpdemo.entity.Customer;
import com.az.mpdemo.dao.CustomerMapper;
import com.az.mpdemo.service.CustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 客户表 服务实现类
 * </p>
 *
 * @author Azhen
 * @since 2021-12-14
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {

}
