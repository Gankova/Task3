package com.company;

public class UserFactory {
    private User user;

    public UserFactory(){
        this.user = new User();
    }
    public UserFactory setUserName(String name){
        this.user.name = name;

        return this;

    }
    public UserFactory setUserAge (int age){
        this.user.age = age;

        return this;

    }
    public UserFactory addHobies (String hobby){
        this.user.hobbies.add(hobby);

        return this;
    }

    public User build () {
        return this.user;
    }
}
