package org.example.domain;

import lombok.Data;

import java.sql.Date;

@Data
public class User {
    private int id;
    private String name;
    private Date birthday;
}
