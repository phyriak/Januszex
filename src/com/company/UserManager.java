package com.company;
import java.util.Scanner;

public class UserManager {


    public JanuszUser loginNewUser() {
        JanuszTools.log("Podaj imie: ");
        return new JanuszUser(new Scanner(System.in).nextLine());


    }
}
