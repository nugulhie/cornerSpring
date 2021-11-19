package com.corner.gnu.cornerArchive.config.auth.dto;

import com.corner.gnu.cornerArchive.domain.users.Users;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String college;
    private String phoneNumber;

    public SessionUser(Users user){
        this.name = user.getName();
        this.email = user.getEmail();
        this.college = user.getCollege();
        this.phoneNumber = user.getPhoneNumber();
    }
}
