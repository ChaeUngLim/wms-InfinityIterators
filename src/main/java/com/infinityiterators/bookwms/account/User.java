package com.infinityiterators.bookwms.account;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int code;
    private String name;
    private Date dateOfBirth;
    private String email;
    private String phone;
    private String address;
    private Account account;    // Association

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", account id='" + account.getId() + "'"+
                '}';
    }
}
