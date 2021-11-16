package com.corner.gnu.cornerArchive.domain.users;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;

    @Column()
    private String name;

    @Column()
    private String gender;

    @Column()
    private String phoneNumber;

    @Column()
    private String college;

    @Builder
    public Users(String name, String gender, String phoneNumber, String college){
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.college = college;
    }

    public void update(String phoneNumber, String college){
        this.phoneNumber = phoneNumber;
        this.college = college;
    }

}
