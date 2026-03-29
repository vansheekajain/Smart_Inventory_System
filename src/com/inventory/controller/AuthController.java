package com.inventory.controller;

public class AuthController {

    public boolean login(String username, String password) {
        // Temporary logic (dummy)
        return username.equals("admin") && password.equals("admin");
    }
}
