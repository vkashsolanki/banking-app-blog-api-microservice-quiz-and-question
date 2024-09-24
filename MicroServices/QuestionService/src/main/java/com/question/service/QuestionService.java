package com.question.service;

import java.util.List;

import com.question.entity.Question;

public interface QuestionService {
	
	
	Question create(Question question);
	List<Question> getAllQuestion();
	Question getOne(long questionId);
	
	List<Question> getQuetionsOfQuiz(long quizId);
}
