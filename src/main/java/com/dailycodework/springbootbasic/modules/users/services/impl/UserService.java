package com.dailycodework.springbootbasic.modules.users.services.impl;


import com.dailycodework.springbootbasic.Services.BaseService;
import com.dailycodework.springbootbasic.modules.users.dtos.LoginRequest;
import com.dailycodework.springbootbasic.modules.users.dtos.LoginResponse;
import com.dailycodework.springbootbasic.modules.users.dtos.UserDTO;
import com.dailycodework.springbootbasic.modules.users.services.interfaces.UserServiceInterface;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService implements UserServiceInterface {
    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        try {
//            String email = loginRequest.getEmail();
//            String password = loginRequest.getPassword();


                String token = "Ramdom_token";
                UserDTO userDTO = new UserDTO(1L, "thanhlinhnguyen22032004@gmail.com");

            return  new LoginResponse(token, userDTO);

        }catch (Exception e) {
            throw new RuntimeException("");
        }

    }
}
