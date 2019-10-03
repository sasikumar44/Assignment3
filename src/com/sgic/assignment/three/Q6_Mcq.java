package com.sgic.assignment.three;

public class Q6_Mcq {
	private String question;
	private String choice_1;
	private String choice_2;
	private String choice_3;
	private String correctChoice;
	
	Q6_Mcq(String q, String c1, String c2, String c3, String cc){
		this.question = q;
		this.choice_1 = c1;
		this.choice_2 = c2;
		this.choice_3 = c3;
		this.correctChoice = cc;		
	}
	
	public String getQuestion() {
		return question;
	}
	
	public String getChoice_1() {
		return choice_1;
	}
	
	public String getChoice_2() {
		return choice_2;
	}
	
	public String getChoice_3() {
		return choice_3;
	}
	
	public String getCorrectChoice() {
		return correctChoice;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public void setChoice_1(String choice_1) {
		this.choice_1 = choice_1;
	}
	
	public void setChoice_2(String choice_2) {
		this.choice_2 = choice_2;
	}
	
	public void setChoice_3(String choice_3) {
		this.choice_3 = choice_3;
	}
	
	public void setCorrectChoice(String correctChoice) {
		this.correctChoice = correctChoice;
	}
	
	

}
