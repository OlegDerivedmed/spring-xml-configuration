package com.spring.learning.demo;

import com.spring.learning.demo.configWithAnnotations.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class DemoApplication {

	public static void main(String[] args) {

		var context = new ClassPathXmlApplicationContext("annotitaionConfig-applicationContext.xml");
		var coach = context.getBean("tennisCoach",Coach.class);
		System.out.println(coach.doCoach());
		context.close();
	}
}
