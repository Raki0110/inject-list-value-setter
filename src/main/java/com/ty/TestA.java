package com.ty;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestA {
	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext=new 
				ClassPathXmlApplicationContext("my_conf.xml");
		Student student = (Student) configurableApplicationContext.getBean("myStudent");
		System.out.println("Student name is : "+student.getName());
		System.out.println("Stduent age is : "+student.getAge());
		System.out.println("==========subjects==========");
		List<String> subjects = student.getSubName();
		for(String subject : subjects) {
			System.out.println(subject);
			
		}
	}

}
