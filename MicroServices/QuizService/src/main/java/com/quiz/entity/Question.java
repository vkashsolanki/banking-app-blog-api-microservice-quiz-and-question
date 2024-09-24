package com.quiz.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Question {


	private long questionId;
	private String question;

	private long quizId;

	public long getQuizId() {
		return quizId;
	}

	public void setQuizId(long quuizId) {
		this.quizId = quuizId;
	}

	public long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
}
