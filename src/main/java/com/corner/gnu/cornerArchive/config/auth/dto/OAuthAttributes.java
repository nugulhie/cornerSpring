package com.corner.gnu.cornerArchive.config.auth.dto;

import com.corner.gnu.cornerArchive.domain.users.Role;
import com.corner.gnu.cornerArchive.domain.users.Users;
import lombok.Builder;
import lombok.Getter;

import java.util.Map;

@Getter
public class OAuthAttributes {
    private Map<String, Object> attributes;
    private String nameAttributeKey;
    private String name;
    private String email;
    private String college;
    private String phoneNumber;

    @Builder
    public OAuthAttributes(Map<String, Object> attributes, String nameAttributeKey, String name, String email, String college, String phoneNumber){
        this.attributes = attributes;
        this.nameAttributeKey = nameAttributeKey;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.college = college;
    }
    public static OAuthAttributes of(String registrationId, String userNameAttributesname, Map<String, Object> attributes){
        return ofGoogle(userNameAttributesname, attributes);
    }
    private static OAuthAttributes ofGoogle(String userNameAttributes, Map<String, Object>attributes){
        return OAuthAttributes.builder()
                .name((String)attributes.get("name"))
                .email((String)attributes.get("email"))
                .college((String)attributes.get("college"))
                .phoneNumber((String)attributes.get("phoneNumber"))
                .attributes(attributes)
                .nameAttributeKey(userNameAttributes)
                .build();
    }
    public Users toEntity(){
        return Users.builder()
                .name(name)
                .email(email)
                .college(college)
                .phoneNumber(phoneNumber)
                .role(Role.GUEST)
                .build();
    }
}
