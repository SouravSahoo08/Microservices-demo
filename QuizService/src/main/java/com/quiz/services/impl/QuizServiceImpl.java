package com.quiz.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.Entities.Quiz;
import com.quiz.Repository.QuizRepository;
import com.quiz.services.QuestionClient;
import com.quiz.services.QuizService;

@Service
public class QuizServiceImpl implements QuizService {

	@Autowired
	private QuizRepository quizRepository;

	@Autowired
	private QuestionClient questionClient;

	@Override
	public Quiz add(Quiz quiz) {
		// TODO Auto-generated method stub
		return quizRepository.save(quiz);
	}

	@Override
	public List<Quiz> getAll() {
		List<Quiz> quizzes = quizRepository.findAll();
		quizzes.stream().map(quiz -> {
			quiz.setQuestions(questionClient.getByQuizId(quiz.getId()));
			return quiz;
		}).collect(Collectors.toList());

		return quizzes;
	}

	@Override
	public Quiz get(Long id) {
		// TODO Auto-generated method stub
		Quiz quiz = quizRepository.findById(id).orElseThrow(() -> new RuntimeException("Quiz not fond"));
		quiz.setQuestions(questionClient.getByQuizId(id));
		return quiz;
	}

}
