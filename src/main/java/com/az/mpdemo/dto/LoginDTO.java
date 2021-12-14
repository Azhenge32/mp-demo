package com.az.mpdemo.dto;

import com.az.mpdemo.entity.Account;
import lombok.Data;

@Data
public class LoginDTO {
    private String path;
    private String error;
    private Account account;
}
