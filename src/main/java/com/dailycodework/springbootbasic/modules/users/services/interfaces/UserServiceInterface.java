package com.dailycodework.springbootbasic.modules.users.services.interfaces;

import com.dailycodework.springbootbasic.modules.users.dtos.LoginRequest;
import com.dailycodework.springbootbasic.modules.users.dtos.LoginResponse;

public interface UserServiceInterface {
    LoginResponse login(LoginRequest loginRequest);
}
