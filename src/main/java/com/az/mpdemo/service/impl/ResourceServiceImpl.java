package com.az.mpdemo.service.impl;

import com.az.mpdemo.entity.Resource;
import com.az.mpdemo.dao.ResourceMapper;
import com.az.mpdemo.service.ResourceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 资源表 服务实现类
 * </p>
 *
 * @author Azhen
 * @since 2021-12-14
 */
@Service
public class ResourceServiceImpl extends ServiceImpl<ResourceMapper, Resource> implements ResourceService {

}
