package com.dailycodework.springbootbasic.modules.users.dtos;

public class UserDTO {

    //final khoi tao ra thi khong the thay doi duoc
    private final Long id;
    private String email;

    //construct
    public UserDTO(Long id, String email) {
        this.id = id;
        this.email = email;
    }

    public Long getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
