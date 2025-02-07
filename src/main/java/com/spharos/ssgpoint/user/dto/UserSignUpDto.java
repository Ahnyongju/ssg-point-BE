package com.spharos.ssgpoint.user.dto;

import lombok.*;

@Builder
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserSignUpDto {
    private String loginId;
    private String password;
    private String name;
    private String email;
    private String phone;
    private String address;
}
