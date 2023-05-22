package com.group.libraryapp.controller;

import com.group.libraryapp.dto.UserCreateRequest;
import com.group.libraryapp.dto.UserUpdateRequest;
import com.group.libraryapp.dto.UserResponse;
import com.group.libraryapp.service.UserServiceV2;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserServiceV2 userService;

    @PostMapping("/user")
    public void saveUser(@RequestBody UserCreateRequest request){
        userService.saveUser(request);
    }
    @GetMapping("/user")
    public List<UserResponse> getUsers(){
        return userService.getUsers();
    }

    @PutMapping("/user")
    public void updateUser(@RequestBody UserUpdateRequest request){
        userService.updateUser(request);
    }

    @DeleteMapping("/user")
    public void deleteUser(@RequestParam String name){
        userService.deleteUser(name);
    }

}
