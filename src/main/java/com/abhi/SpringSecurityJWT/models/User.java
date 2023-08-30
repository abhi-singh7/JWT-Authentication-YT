package com.abhi.SpringSecurityJWT.models;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {


    private String userId;
    private  String name;
    private String email;

}
