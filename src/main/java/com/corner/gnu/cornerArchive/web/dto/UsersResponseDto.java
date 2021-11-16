package com.corner.gnu.cornerArchive.web.dto;

import com.corner.gnu.cornerArchive.domain.users.Users;
import lombok.Getter;


@Getter
public class UsersResponseDto {
    private Long uid;
    private String name;
    private String gender;
    private String phoneNumber;
    private String college;

    public UsersResponseDto(Users Entity){
        this.uid = Entity.getUid();
        this.name = Entity.getName();
        this.gender = Entity.getGender();
        this.college = Entity.getCollege();
        this.phoneNumber = Entity.getPhoneNumber();
    }
}
