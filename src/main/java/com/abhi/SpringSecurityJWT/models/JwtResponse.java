package com.abhi.SpringSecurityJWT.models;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class JwtResponse {

    String jwtToken;
    String userName;

}
