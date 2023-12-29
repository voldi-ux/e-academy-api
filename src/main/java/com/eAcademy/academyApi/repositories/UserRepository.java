package com.eAcademy.academyApi.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eAcademy.academyApi.users.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUsername(String username);
    Optional<User>  findByUsernameAndId(String username, long id);
}
