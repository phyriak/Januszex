package com.company;

import java.util.Date;

public class JanuszUser {

    private String name;
    private String surname;
    private Date birthDate;

    public String getName() {
        return name;
    }








    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public JanuszUser(String userName) {
        this.name = userName;
        System.out.println("JanuszUser created");

    }
}
