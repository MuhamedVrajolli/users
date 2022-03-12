/*
 * Created by Muhamed Vrajolli on 11/03/2022.
 */

package com.ucx.users.manageusers.models;

import com.ucx.users.manageusers.constants.UserConstants;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(UserConstants.USER_TYPE_STUDENT)
public class StudentModel extends UserModel {
  private Integer studentId;
  private String classroomName;

  public Integer getStudentId() {
    return studentId;
  }

  public void setStudentId(Integer studentId) {
    this.studentId = studentId;
  }

  public String getClassroomName() {
    return classroomName;
  }

  public void setClassroomName(String classroomName) {
    this.classroomName = classroomName;
  }

  @Override
  public void update(UserModel userModel) {
    super.update(userModel);

    StudentModel studentModel = (StudentModel) userModel;
    this.studentId = studentModel.studentId;
    this.classroomName = studentModel.classroomName;
  }

  @Override
  public String getUserType() {
    return UserConstants.USER_TYPE_STUDENT;
  }
}
