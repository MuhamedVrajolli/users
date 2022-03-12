/*
 * Created by Muhamed Vrajolli on 11/03/2022.
 */

package com.ucx.users.manageusers.models;

import com.ucx.users.manageusers.constants.UserConstants;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(UserConstants.USER_TYPE_TEACHER)
public class TeacherModel extends UserModel {
  private Integer teacherId;

  public Integer getTeacherId() {
    return teacherId;
  }

  public void setTeacherId(Integer teacherId) {
    this.teacherId = teacherId;
  }

  @Override
  public void update(UserModel userModel) {
    super.update(userModel);
    this.teacherId = ((TeacherModel) userModel).teacherId;
  }

  @Override
  public String getUserType() {
    return UserConstants.USER_TYPE_TEACHER;
  }
}
