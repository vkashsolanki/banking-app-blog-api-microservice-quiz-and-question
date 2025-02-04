package com.quiz.service.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.quiz.entity.Question;

@FeignClient(url = "http://localhost:8061", value = "Question-Client")
public interface QuestionClient {
	
	
	@GetMapping("/question/quiz/{quizId}")
	List<Question>  getQuetionsOfQuiz(@PathVariable long quizId);

}
