/*
 * Created by Muhamed Vrajolli on 11/03/2022.
 */

package com.ucx.users.commons.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BoBaseModel {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Long id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
