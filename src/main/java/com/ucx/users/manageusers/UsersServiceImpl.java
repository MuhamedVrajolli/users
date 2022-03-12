/*
 * Created by Muhamed Vrajolli on 11/03/2022.
 */

package com.ucx.users.manageusers;

import com.ucx.users.manageusers.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UsersServiceImpl implements UsersService {
  private final UsersRepository usersRepository;

  @Autowired
  public UsersServiceImpl(UsersRepository usersRepository) {
    this.usersRepository = usersRepository;
  }

  @Override
  public UserModel createUser(UserModel userModel) {
    return usersRepository.save(userModel);
  }

  @Override
  public Page<UserModel> getUsers(String userType, Pageable pageable) {
    if (userType == null) {
      return usersRepository.findAll(pageable);
    }
    return usersRepository.findAllByUserType(userType, pageable);
  }

  @Override
  public UserModel getUser(Long id) {
    return usersRepository.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
  }

  @Override
  public UserModel updateUser(Long id, UserModel userModel) {
    UserModel user = usersRepository.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

    if (!user.getUserType().equals(userModel.getUserType())) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, String.format("provided user type '%s' does not match with actual user type '%s'", userModel.getUserType(), user.getUserType()));
    }

    user.update(userModel);
    return usersRepository.save(user);
  }

  @Override
  public void deleteUser(Long id) {
    usersRepository.deleteById(id);
  }
}
