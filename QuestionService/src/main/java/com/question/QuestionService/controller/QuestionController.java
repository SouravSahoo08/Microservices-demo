package com.question.QuestionService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.QuestionService.entites.Question;
import com.question.QuestionService.services.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private QuestionService questionService;
	
	@PostMapping
	public Question create(@RequestBody Question question) {
		return questionService.add(question);
	}
	
	@GetMapping
	public List<Question> getAll(){
		return questionService.getAll();
	}

	// get by question id
	@GetMapping("/{questionId}")
	public Question get(@PathVariable Long questionId){
		return questionService.get(questionId);
	}

	// get question by quiz id
	@GetMapping("/quiz/{quizId}")
	public List<Question> getByQuizId(@PathVariable Long quizId){
		return questionService.getByQuizId(quizId);
	}
}
