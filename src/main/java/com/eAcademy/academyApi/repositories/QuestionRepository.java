package com.eAcademy.academyApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eAcademy.academyApi.question.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long>{

}
