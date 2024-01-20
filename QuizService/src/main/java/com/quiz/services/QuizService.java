package com.quiz.services;

import java.util.List;

import com.quiz.Entities.Quiz;

public interface QuizService {

	Quiz add(Quiz quiz);
	List<Quiz> getAll();
	Quiz get(Long id);
}
