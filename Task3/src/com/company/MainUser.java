package com.company;

public class MainUser {
    public static void main(String[] args){
        UserFactory factory = new UserFactory();
        User u = factory
                .setUserAge(12)
                .setUserName("vasya")
                .addHobies("box")
                .addHobies("sleep")
                .build();

        System.out.println(u.name);
        System.out.println(u.age);
        System.out.println(u.hobbies);
    }
}
