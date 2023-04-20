package com.MockOnOOPS;

public class StudentInfo {

	public static void main(String[] args) {

		Student s = new Student();

		// this is private
//		System.out.println(s.rollNo);
//		s.doPrivate();

		System.out.println("..............");

		// this is default
		System.out.println(s.addmisiionNo);
		s.doDefault();

		System.out.println("..............");

		// this is protected
		System.out.println(s.age);
		s.doProtected();

		System.out.println("..............");

		// this is public
		System.out.println(s.courseId);
		s.doPublic();

	}
}
