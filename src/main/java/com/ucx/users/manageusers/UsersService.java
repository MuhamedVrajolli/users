/*
 * Created by Muhamed Vrajolli on 11/03/2022.
 */

package com.ucx.users.manageusers;

import com.ucx.users.manageusers.constants.UserConstants;
import com.ucx.users.manageusers.models.UserModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

@Validated
public interface UsersService {
  UserModel createUser(@Valid UserModel userModel);

  Page<UserModel> getUsers(
          @Pattern(regexp = UserConstants.USER_TYPE_ADMIN + "|" + UserConstants.USER_TYPE_TEACHER + "|" + UserConstants.USER_TYPE_STUDENT, message = "{user.userType.valid}")
          String userType,
          Pageable pageable
  );

  UserModel getUser(Long id);

  UserModel updateUser(Long id, @Valid UserModel userModel);

  void deleteUser(Long id);
}
