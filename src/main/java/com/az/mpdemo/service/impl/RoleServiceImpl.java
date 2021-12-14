package com.az.mpdemo.service.impl;

import com.az.mpdemo.entity.Role;
import com.az.mpdemo.dao.RoleMapper;
import com.az.mpdemo.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author Azhen
 * @since 2021-12-14
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
