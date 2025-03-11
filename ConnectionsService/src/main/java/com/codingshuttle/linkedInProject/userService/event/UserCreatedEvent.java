package com.codingshuttle.linkedInProject.userService.event;

import lombok.Builder;
import lombok.Data;

@Data
public class UserCreatedEvent {
    private Long userId;
    private String name;
}
