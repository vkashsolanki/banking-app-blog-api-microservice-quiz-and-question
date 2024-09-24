package com.question.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.entity.Question;
import com.question.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

	private QuestionService questionService;

	

	public QuestionController(QuestionService questionService) {
		super();
		this.questionService = questionService;
	}

	// create
	@PostMapping
	public Question creates(@RequestBody Question question) {

		return questionService.create(question);

	}

	// get all
	@GetMapping
	public List<Question> getAlls() {

		return questionService.getAllQuestion();
	}

	// get One
	@GetMapping("/{questionId}")
	public Question getOnes(@PathVariable long questionId) {
		return questionService.getOne(questionId);
	}

	// Get all questions at specific quiz
	@GetMapping("/quiz/{quuizId}")
	public List<Question> getQuistionOfQuiz(@PathVariable long quuizId) {
		return questionService.getQuetionsOfQuiz(quuizId);

	}

}
