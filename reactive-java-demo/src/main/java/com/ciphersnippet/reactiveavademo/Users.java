package com.ciphersnippet.reactiveavademo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Users {

    private String name;
    private Integer salary;
}
