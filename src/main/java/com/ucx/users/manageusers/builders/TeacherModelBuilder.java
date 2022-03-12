/*
 * Created by Muhamed Vrajolli on 12/03/2022.
 */

package com.ucx.users.manageusers.builders;

import com.ucx.users.manageusers.constants.UserConstants;
import com.ucx.users.manageusers.models.TeacherModel;

public final class TeacherModelBuilder {
  private Long id;
  private Integer teacherId;
  private String firstName;
  private String lastName;
  private String email;
  private String password;

  private TeacherModelBuilder() {
  }

  public static TeacherModelBuilder aTeacherModel() {
    return new TeacherModelBuilder();
  }

  public TeacherModelBuilder withId(Long id) {
    this.id = id;
    return this;
  }

  public TeacherModelBuilder withTeacherId(Integer teacherId) {
    this.teacherId = teacherId;
    return this;
  }

  public TeacherModelBuilder withFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public TeacherModelBuilder withLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public TeacherModelBuilder withEmail(String email) {
    this.email = email;
    return this;
  }

  public TeacherModelBuilder withPassword(String password) {
    this.password = password;
    return this;
  }

  public TeacherModel build() {
    TeacherModel teacherModel = new TeacherModel();
    teacherModel.setId(id);
    teacherModel.setTeacherId(teacherId);
    teacherModel.setFirstName(firstName);
    teacherModel.setLastName(lastName);
    teacherModel.setEmail(email);
    teacherModel.setPassword(password);
    teacherModel.setUserType(UserConstants.USER_TYPE_TEACHER);
    return teacherModel;
  }
}
