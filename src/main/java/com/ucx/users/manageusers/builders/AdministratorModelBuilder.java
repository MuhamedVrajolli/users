/*
 * Created by Muhamed Vrajolli on 12/03/2022.
 */

package com.ucx.users.manageusers.builders;

import com.ucx.users.manageusers.constants.UserConstants;
import com.ucx.users.manageusers.models.AdministratorModel;

public final class AdministratorModelBuilder {
  private Long id;
  private Integer adminId;
  private String firstName;
  private String lastName;
  private String email;
  private String password;

  private AdministratorModelBuilder() {
  }

  public static AdministratorModelBuilder anAdministratorModel() {
    return new AdministratorModelBuilder();
  }

  public AdministratorModelBuilder withId(Long id) {
    this.id = id;
    return this;
  }

  public AdministratorModelBuilder withAdminId(Integer adminId) {
    this.adminId = adminId;
    return this;
  }

  public AdministratorModelBuilder withFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public AdministratorModelBuilder withLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public AdministratorModelBuilder withEmail(String email) {
    this.email = email;
    return this;
  }

  public AdministratorModelBuilder withPassword(String password) {
    this.password = password;
    return this;
  }

  public AdministratorModel build() {
    AdministratorModel administratorModel = new AdministratorModel();
    administratorModel.setId(id);
    administratorModel.setAdminId(adminId);
    administratorModel.setFirstName(firstName);
    administratorModel.setLastName(lastName);
    administratorModel.setEmail(email);
    administratorModel.setPassword(password);
    administratorModel.setUserType(UserConstants.USER_TYPE_ADMIN);
    return administratorModel;
  }
}
