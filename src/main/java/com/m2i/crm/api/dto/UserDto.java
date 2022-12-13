package com.m2i.crm.api.dto;

import lombok.Data;

@Data
public class UserDto {
    Integer user_id;
    String password;
    String mail;
    String grants;
}
