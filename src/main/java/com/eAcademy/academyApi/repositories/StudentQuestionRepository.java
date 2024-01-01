package com.eAcademy.academyApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eAcademy.academyApi.question.StudentQuestion;

@Repository
public interface StudentQuestionRepository extends JpaRepository<StudentQuestion, Long> {

}
