package com.group.libraryapp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserUpdateRequest {
    private long id;
    private String name;
}
