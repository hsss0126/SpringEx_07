package com.javalec.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();

		ctx.load("classpath:applicationCTX.xml");
		ctx.refresh();

		Student student = ctx.getBean("student", Student.class);
		System.out.println("이름 : "+student.getName());
		System.out.println("나이 : "+student.getAge());
		System.out.println("================================");
		Student student1 = ctx.getBean("student", Student.class);
		student1.setName("노현숙");
		student1.setAge(25);
		System.out.println("이름 : "+student1.getName());
		System.out.println("나이 : "+student1.getAge());

		System.out.println("================================");
		System.out.println("이름 : "+student.getName());
		System.out.println("나이 : "+student.getAge());
		System.out.println("================================");
		Student student3 = ctx.getBean("student", Student.class);
		System.out.println("이름 : "+student3.getName());
		System.out.println("나이 : "+student3.getAge());

		if(student.equals(student1)){
			System.out.println("student==student1");
		} else {
			System.out.println("student!=student1");
		}

		ctx.close();
	}

}
