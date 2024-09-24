package com.quiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.entity.Quiz;
import com.quiz.repository.QuizRepository;
@Service
public class QuizServiceImpl implements QuizService{
	
	private QuizRepository quizRepository;
	

	public QuizServiceImpl(QuizRepository quizRepository) {
		this.quizRepository = quizRepository;
	}
	
	//data a record 
	@Override
	public Quiz add(Quiz quiz) {
		
		return quizRepository.save(quiz);
	}

	// find a record all
	@Override
	public List<Quiz> getAllQuiz() {
		
		return quizRepository.findAll();
	}
	// find signle record
	@Override
	public Quiz getSinleQuiz(long id) {
		// its return object so use 
		return quizRepository.findById(id).orElseThrow(() -> new RuntimeException("Quiz Not Found"));
	}

}
