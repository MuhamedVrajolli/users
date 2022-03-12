/*
 * Created by Muhamed Vrajolli on 11/03/2022.
 */

package com.ucx.users.manageusers;

import com.ucx.users.manageusers.models.UserModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UsersRepository extends PagingAndSortingRepository<UserModel, Long>, JpaSpecificationExecutor<UserModel> {
  Page<UserModel> findAllByUserType(String userType, Pageable pageable);
}
