package com.fse4.skilltracker.jwt.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginReq {
	  
    private String username; 
    private String password; }
