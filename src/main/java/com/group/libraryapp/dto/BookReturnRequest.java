package com.group.libraryapp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookReturnRequest {
    private String userName;
    private String bookName;
}
