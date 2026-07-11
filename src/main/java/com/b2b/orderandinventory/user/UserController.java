package com.b2b.orderandinventory.user;

import com.b2b.orderandinventory.model.User;
import com.b2b.orderandinventory.user.dto.CreateUserDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody CreateUserDto createUserDto){
        return userService.createUser(createUserDto);
    }

}
