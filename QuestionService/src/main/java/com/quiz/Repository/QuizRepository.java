package com.quiz.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.Entities.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {

}
