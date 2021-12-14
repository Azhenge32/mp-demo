 package com.az.mpdemo.service;

import com.az.mpdemo.dto.LoginDTO;
import com.az.mpdemo.entity.Account;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpSession;

 /**
 * <p>
 * 账号表 服务类
 * </p>
 *
 * @author Azhen
 * @since 2021-12-14
 */
public interface AccountService extends IService<Account> {
    LoginDTO login(String username, String password);
}
