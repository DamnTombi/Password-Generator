package com.example.password;

import java.util.Random;

public class PasswordGenerator {

    private static final String CHARS =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+=-/*№;:?()><";

    public String generatePassword(int length) {
        StringBuilder sb = new StringBuilder();
        Random rnd = new Random();

        for (int i = 0; i < length; i++) {
            sb.append(CHARS.charAt(rnd.nextInt(CHARS.length())));
        }
        return sb.toString();
    }
}
