package com.example.samsung.demolist;

/**
 * Created by Samsung on 14/09/2015.
 */
public class OceanStudent {
    public enum Gender{
        MALE, FEMALE;
    }

    String name;
    int age;
    Gender gender;

    public OceanStudent(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
