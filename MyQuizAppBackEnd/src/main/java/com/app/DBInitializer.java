package com.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Quiz;
import com.app.service.QuizService;

@Component
public class DBInitializer implements CommandLineRunner{
	private QuizService service;
	public DBInitializer(QuizService service) {
		this.service=service;
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Quiz quiz1 =new Quiz("It was raining yesterday, so we __________ out.","did not go\n" + "\n" +"","did not went"," would not go"," would not gone",1);
		Quiz quiz2 =new Quiz("I __________ what was happening."," couldn’t understood","couldn’t understand","was not able to understood","was not able to understand",2);
		Quiz quiz3 = new Quiz("If you work hard, you __________ good marks."," would get","  would got"," will get","  will got",3);
		Quiz quiz4=new Quiz( "If you __________ hard, you would not have failed in the exam.", " have work", "have worked", "had work", " had worked", 4);
		Quiz quiz5=new Quiz( "If the camera was working, we __________ a movie.","could made", " could make", " would made", "would make", 2);
		Quiz quiz6=new Quiz( "Emma is getting __________ the car.", "of", "off", "out of","out off", 3);
		Quiz quiz7=new Quiz("Near the London Eye, there is a bridge __________ the Thames River.", "above  ", "over   ", "off  ", "towards", 2);
		Quiz quiz8=new Quiz("Asmat is falling __________ the horse.", "from", "of", "off", "above", 3);
		Quiz quiz9=new Quiz("She is looking for a job in __________ electronic or print media.  ", " both ", " between", " neither", "either", 4);
		Quiz quiz10=new Quiz("They could save money if they bought __________ furniture.", "economical  ", "economic  ", "economize  ", "economy", 1);
		this.service.saveQuiz(quiz1);
		this.service.saveQuiz(quiz2);
		this.service.saveQuiz(quiz3);
		this.service.saveQuiz(quiz4);
		this.service.saveQuiz(quiz5);
		this.service.saveQuiz(quiz6);
		this.service.saveQuiz(quiz7);
		this.service.saveQuiz(quiz8);
		this.service.saveQuiz(quiz9);
		this.service.saveQuiz(quiz10);
		System.out.println("Database has been initialized");
		
	}

}
