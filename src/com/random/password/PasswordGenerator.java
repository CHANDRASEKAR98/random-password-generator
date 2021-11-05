package com.random.password;

import java.util.Random;

public class PasswordGenerator {
	
	public static void main(String[] args) {
        String password = randomPasswordGenerator();
        
        System.out.println(password);
        
    }
    
    private static String randomPasswordGenerator() {
        int leftLimit = 48;
        int rightLimit = 122;
        int targetStringLength = 8;
        
        return new Random().ints(leftLimit, rightLimit + 1).filter(num -> (num <= 57 || num >= 65) && (num <= 90 || num >= 97)).limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }

}
