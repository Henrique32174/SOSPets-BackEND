package com.tcc.sospets.Firebase;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FBRequest {

    private String email;
    private String password;
    private boolean returnSecureToken;

}