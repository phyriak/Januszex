package com.company;

public abstract class JanuszTools {

    static public void log(String message) {
        System.out.println("JanuszLog: " + message);
    }

    static String getSexByName(String name) {
        char lastLetter = name.charAt(name.length() - 1);
        if (lastLetter == 'a') {
            return Gender.FEMALE.toString();
        } else {
            return Gender.MALE.toString();
        }
    }
}

