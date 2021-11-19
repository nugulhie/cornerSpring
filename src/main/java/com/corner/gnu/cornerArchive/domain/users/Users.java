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

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String college;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;


    @Builder
    public Users(String name, String email, String college, Role role, String phoneNumber){
        this.name = name;
        this.email = email;
        this.college = college;
        this.phoneNumber = phoneNumber;
        this.role = role;
    }

    public Users update(String name, String college){
        this.name = name;
        this.college = college;
        return this;
    }

    public String getRoleKey(){
        return this.role.getKey();
    }

}
