package com.question.QuestionService.services;

import java.util.List;

import com.question.QuestionService.entites.Question;

public interface QuestionService {

	Question add(Question question);
	List<Question> getAll();
	Question get(Long questionId);
	List<Question> getByQuizId(Long quizId);
}
