package com.company;

public class Details {
    String gender;
    String birthdate;
    String town;
    int age;

    Details(String gender, String birthdate, int age) {
        this.gender = gender;
        this.birthdate = birthdate;
        this.town=town;
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}
























