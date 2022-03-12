/*
 * Created by Muhamed Vrajolli on 11/03/2022.
 */

package com.ucx.users.manageusers;

import com.ucx.users.manageusers.constants.UserConstants;
import com.ucx.users.manageusers.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {
  private final UsersService usersService;

  @Autowired
  public UsersController(UsersService usersService) {
    this.usersService = usersService;
  }

  @PostMapping(value = "")
  @ResponseStatus(value = HttpStatus.CREATED)
  public UserModel createUser(@RequestBody UserModel userModel) {
    return usersService.createUser(userModel);
  }

  @GetMapping("")
  public Page<UserModel> getUsers(@RequestParam(required = false, value = UserConstants.USER_TYPE) String userType, Pageable pageable) {
    return usersService.getUsers(userType, pageable);
  }

  @GetMapping("/{id}")
  public UserModel getUser(@PathVariable Long id) {
    return usersService.getUser(id);
  }

  @PutMapping("/{id}")
  public UserModel updateUser(@PathVariable Long id, @RequestBody UserModel userModel) {
    return usersService.updateUser(id, userModel);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(value = HttpStatus.NO_CONTENT)
  public void deleteUser(@PathVariable Long id) {
    usersService.deleteUser(id);
  }
}
