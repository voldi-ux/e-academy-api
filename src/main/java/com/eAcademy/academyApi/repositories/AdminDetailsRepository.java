package com.eAcademy.academyApi.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eAcademy.academyApi.admin.AdminDetails;
import com.eAcademy.academyApi.users.User;


@Repository
public interface AdminDetailsRepository  extends JpaRepository<AdminDetails, Long>{

	Optional<AdminDetails> findByAdminId(User user);

}
