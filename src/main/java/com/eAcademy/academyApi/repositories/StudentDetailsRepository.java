package com.eAcademy.academyApi.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eAcademy.academyApi.student.StudentDetails;
import com.eAcademy.academyApi.users.User;

@Repository
public interface StudentDetailsRepository  extends JpaRepository<StudentDetails,Long>{

	Optional<StudentDetails> findByStudentId(User user);

}
