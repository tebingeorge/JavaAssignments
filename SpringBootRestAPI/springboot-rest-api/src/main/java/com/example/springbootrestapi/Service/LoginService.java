package com.example.springbootrestapi.Service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public String validateLogin(String username, String password) {
        if ("admin".equals(username) && "admin123".equals(password)) {
            return "Login Successful";
        }
        return "Invalid Credentials";
    }
}
