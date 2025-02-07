package com.spharos.ssgpoint.user.application;

import com.spharos.ssgpoint.user.dto.*;

import java.util.List;

public interface UserService {
    void createUser(UserSignUpDto userSignUpDto);
    UserGetDto getUserByLoginId(String loginId);
    UserGetDto getUserByUUID(String UUID);
    List<UserGetDto> getAllUsers();
    void updateUserInfo(String UUID, UserUpdateDto userUpdateRequestDto);
    void validateDuplicateLoginId(UserSignUpDto userSignUpDto); // UserSignUpDto에서 loginId만
    void resetPassword(String UUID, PasswordResetDto passwordResetDto);
    void updatePassword(String UUID, PasswordUpdateDto passwordUpdateDto);
}
