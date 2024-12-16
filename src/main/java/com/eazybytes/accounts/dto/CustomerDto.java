package com.eazybytes.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;


@Data
public class CustomerDto {

    private String name;
    private String email;
    private String mobileNumber;

    public AccountsDto accountsDto;

}
