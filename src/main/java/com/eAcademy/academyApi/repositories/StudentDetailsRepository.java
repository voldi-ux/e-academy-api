package com.eAcademy.academyApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eAcademy.academyApi.student.StudentDetails;

public interface StudentDetailsRepository  extends JpaRepository<StudentDetails,Long>{

}
