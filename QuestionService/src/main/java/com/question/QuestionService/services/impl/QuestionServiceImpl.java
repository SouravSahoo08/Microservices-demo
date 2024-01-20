package com.question.QuestionService.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question.QuestionService.entites.Question;
import com.question.QuestionService.repository.QuestionRepository;
import com.question.QuestionService.services.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	private QuestionRepository questionRepository;

	@Override
	public Question add(Question question) {
		// TODO Auto-generated method stub
		return questionRepository.save(question);
	}

	@Override
	public List<Question> getAll() {
		// TODO Auto-generated method stub
		return questionRepository.findAll();
	}

	@Override
	public Question get(Long questionId) {
		// TODO Auto-generated method stub
		return questionRepository.findById(questionId).orElseThrow(() -> new RuntimeException("Question not found"));
	}

	@Override
	public List<Question> getByQuizId(Long quizId) {
		// TODO Auto-generated method stub
		return questionRepository.getByQuizId(quizId);
	}

}
