package com.quiz.service;

import java.util.List;

import com.quiz.entity.Quiz;

public interface QuizService {
	
	Quiz add(Quiz quiz);
	List<Quiz> getAllQuiz();
	Quiz getSinleQuiz(long id);

}
