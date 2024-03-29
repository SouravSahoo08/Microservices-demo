package com.question.QuestionService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.question.QuestionService.entites.Question;

public interface QuestionRepository extends JpaRepository<Question, Long>{

	List<Question> getByQuizId(long quizId);
}
