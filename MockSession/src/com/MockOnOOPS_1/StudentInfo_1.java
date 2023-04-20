package com.MockOnOOPS_1;

import com.MockOnOOPS.Student;

public class StudentInfo_1 extends Student {

	public static void main(String[] args) {

		StudentInfo_1 s1 = new StudentInfo_1();

		// this is private
//		System.out.println(s.rollNo);
//		s.doPrivate();

		System.out.println("..............");

		// this is default
//		System.out.println(s1.addmisiionNo);
//		s1.doDefault();

		System.out.println("..............");

		// this is protected
		System.out.println(s1.age);
		s1.doProtected();

		System.out.println("..............");

		// this is public
		System.out.println(s1.courseId);
		s1.doPublic();
	}
}
