package com.b2b.orderandinventory.user;

import java.util.List;

import com.b2b.orderandinventory.mapper.EntityMapper;
import com.b2b.orderandinventory.user.dto.UserResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.b2b.orderandinventory.user.dto.CreateUserDto;


@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private final EntityMapper mapper;

    public UserController(UserService userService, EntityMapper mapper) {
        this.userService = userService;
        this.mapper = mapper;
    }

    @PostMapping
    public UserResponse createUser(@RequestBody CreateUserDto createUserDto){
        return mapper.toResponse(userService.createUser(createUserDto));
    }

    @GetMapping
    public List<UserResponse> findAll() {
        return mapper.toUserResponseList(userService.findAll());
    }
    

}
