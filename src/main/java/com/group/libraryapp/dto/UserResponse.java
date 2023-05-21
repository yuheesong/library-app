package com.group.libraryapp.dto;

import com.group.libraryapp.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {
    private long id;
    private String name;
    private Integer age;

    public UserResponse(long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public UserResponse(User user){
        this.id = user.getId();
        this.name=user.getName();
        this.age=user.getAge();
    }

    public UserResponse(long id, User user) {
        this.id = id;
        this.name = user.getName();
        this.age = user.getAge();
    }
}
