package com.home.controller;

import com.home.dto.PutMoneyRequest;
import com.home.dto.TakeMoneyRequest;
import com.home.dto.UserResponse;
import com.home.model.User;
import com.home.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/v1/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public UserResponse getBalance(@PathVariable("id") int id) {
        User user = userService.getBalance(id);
        return new UserResponse(user.getId(), user.getBalance());
    }

    @PatchMapping(value = "/takeMoney/{id}")
    @ResponseStatus(HttpStatus.OK)
    public UserResponse takeMoney(@PathVariable("id") int id,
                                  @RequestBody TakeMoneyRequest request) {
        User user = userService.takeMoney(id, request.getTakeMoney());
        return new UserResponse(user.getId(), user.getBalance());
    }

    @PatchMapping(value = "/putMoney/{id}")
    @ResponseStatus(HttpStatus.OK)
    public UserResponse putMoney(@PathVariable("id") int id,
                                 @RequestBody PutMoneyRequest request) {
        User user = userService.putMoney(id, request.getPutMoney());
        return new UserResponse(user.getId(), user.getBalance());
    }


}
