package com.company;

import com.company.JanuszSklep;
import com.company.JanuszTools;
import com.company.JanuszUser;
import com.company.UserManager;

public class Main {

    public static void main(String[] args) {
        JanuszUser user = new UserManager().loginNewUser();

        JanuszSklep januszSklep = new JanuszSklep(user);
        januszSklep.setFakeData();
        januszSklep.getTotal();


       JanuszTools.log("TOTAL: " + januszSklep.getKoszyk().toString());
    }
}
