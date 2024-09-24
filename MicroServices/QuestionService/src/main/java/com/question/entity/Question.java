package com.question.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "questions")
@NoArgsConstructor
@AllArgsConstructor
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
