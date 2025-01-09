package com.dailycodework.springbootbasic.modules.users.dtos;

public class LoginResponse {

    //khi khởi tạo thì không the thay doi
    private final String token;
    private UserDTO user;

    //constructor
    public LoginResponse(String token, UserDTO user) {
        this.token = token;
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public UserDTO getUser() {
        return user;
    }
}
