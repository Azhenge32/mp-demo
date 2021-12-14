package com.az.mpdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.az.mpdemo.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 账号表
 * </p>
 *
 * @author Azhen
 * @since 2021-12-14
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Account extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "account_id", type = IdType.AUTO)
    private Long accountId;

    /**
     * 角色id
     */
    private Long roleId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 加密盐
     */
    private String salt;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 性别
     */
    private String sex;

    /**
     * 邮箱
     */
    private String email;


}
