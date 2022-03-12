/*
 * Created by Muhamed Vrajolli on 12/03/2022.
 */

package com.ucx.users.manageusers.builders;

import com.ucx.users.manageusers.constants.UserConstants;
import com.ucx.users.manageusers.models.StudentModel;

public final class StudentModelBuilder {
  private Long id;
  private Integer studentId;
  private String classroomName;
  private String firstName;
  private String lastName;
  private String email;
  private String password;

  private StudentModelBuilder() {
  }

  public static StudentModelBuilder aStudentModel() {
    return new StudentModelBuilder();
  }

  public StudentModelBuilder withId(Long id) {
    this.id = id;
    return this;
  }

  public StudentModelBuilder withStudentId(Integer studentId) {
    this.studentId = studentId;
    return this;
  }

  public StudentModelBuilder withClassroomName(String classroomName) {
    this.classroomName = classroomName;
    return this;
  }

  public StudentModelBuilder withFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public StudentModelBuilder withLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public StudentModelBuilder withEmail(String email) {
    this.email = email;
    return this;
  }

  public StudentModelBuilder withPassword(String password) {
    this.password = password;
    return this;
  }

  public StudentModel build() {
    StudentModel studentModel = new StudentModel();
    studentModel.setId(id);
    studentModel.setStudentId(studentId);
    studentModel.setClassroomName(classroomName);
    studentModel.setFirstName(firstName);
    studentModel.setLastName(lastName);
    studentModel.setEmail(email);
    studentModel.setPassword(password);
    studentModel.setUserType(UserConstants.USER_TYPE_STUDENT);
    return studentModel;
  }
}
