/*
 * Created by Muhamed Vrajolli on 11/03/2022.
 */

package com.ucx.users.manageusers.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.ucx.users.commons.models.BoBaseModel;
import com.ucx.users.manageusers.constants.UserConstants;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity(name = "users")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name=UserConstants.USER_TYPE, discriminatorType = DiscriminatorType.STRING)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = UserConstants.USER_TYPE)
@JsonSubTypes({
        @JsonSubTypes.Type(value = AdministratorModel.class, name = UserConstants.USER_TYPE_ADMIN),
        @JsonSubTypes.Type(value = TeacherModel.class, name = UserConstants.USER_TYPE_TEACHER),
        @JsonSubTypes.Type(value = StudentModel.class, name = UserConstants.USER_TYPE_STUDENT)
})
public class UserModel extends BoBaseModel {
  @NotBlank(message = "{notBlank}")
  private String firstName;
  @NotBlank(message = "{notBlank}")
  private String lastName;
  @Email(message = "{email}")
  private String email;
  @NotBlank(message = "{notBlank}")
  private String password;
  @Column(name = UserConstants.USER_TYPE, insertable = false, updatable = false)
  @JsonIgnore
  private String userType;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getUserType() {
    return userType;
  }

  public void setUserType(String userType) {
    this.userType = userType;
  }

  public void update(UserModel userModel) {
    this.firstName = userModel.firstName;
    this.lastName = userModel.lastName;
    this.email = userModel.email;
    this.password = userModel.password;
  }
}
