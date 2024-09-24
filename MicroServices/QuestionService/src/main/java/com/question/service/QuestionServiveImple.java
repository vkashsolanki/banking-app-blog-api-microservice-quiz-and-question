package com.question.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question.entity.Question;
import com.question.repository.QuestionRepository;

@Service
public class QuestionServiveImple implements QuestionService {

	private QuestionRepository questionRepository;

	public QuestionServiveImple(QuestionRepository questionRepository) {
		super();
		this.questionRepository = questionRepository;
	}

	@Override
	public Question create(Question question) {

		return questionRepository.save(question);
	}

	@Override
	public List<Question> getAllQuestion() {

		return questionRepository.findAll();
	}

	@Override
	public Question getOne(long questionId) {

		return questionRepository.findById(questionId).orElseThrow( ()-> new RuntimeException("Question Not Found"));
	}

	@Override
	public List<Question> getQuetionsOfQuiz(long quizId) {
	
		return questionRepository.findByQuizId(quizId);
	}

}
