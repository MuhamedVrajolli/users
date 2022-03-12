/*
 * Created by Muhamed Vrajolli on 11/03/2022.
 */

package com.ucx.users.manageusers.models;

import com.ucx.users.manageusers.constants.UserConstants;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(UserConstants.USER_TYPE_ADMIN)
public class AdministratorModel extends UserModel {
  private Integer adminId;

  public Integer getAdminId() {
    return adminId;
  }

  public void setAdminId(Integer adminId) {
    this.adminId = adminId;
  }

  @Override
  public void update(UserModel userModel) {
    super.update(userModel);
    this.adminId = ((AdministratorModel) userModel).adminId;
  }

  @Override
  public String getUserType() {
    return UserConstants.USER_TYPE_ADMIN;
  }
}
