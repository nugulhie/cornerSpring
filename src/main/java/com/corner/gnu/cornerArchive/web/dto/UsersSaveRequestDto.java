package com.corner.gnu.cornerArchive.web.dto;

import com.corner.gnu.cornerArchive.domain.users.Users;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UsersSaveRequestDto {
    private String name;
    private String gender;
    private String phoneNumber;
    private String college;

    @Builder
    public UsersSaveRequestDto(String name, String gender, String phoneNumber, String college){
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.college = college;
    }

    public Users toEntity(){
        return Users.builder()
                .name(name)
                .gender(gender)
                .phoneNumber(phoneNumber)
                .college(college)
                .build();
    }
}
