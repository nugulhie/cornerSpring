package com.corner.gnu.cornerArchive.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UsersUpdateRequestDto {
    private String phoneNumber;
    private String college;

    @Builder
    public UsersUpdateRequestDto(String phoneNumber, String college){
        this.college = college;
        this.phoneNumber = phoneNumber;
    }
}
