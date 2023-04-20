package com.MockOnOOPS;

public class Student {

	private int rollNo = 21;
	int addmisiionNo = 1999;
	protected int age = 24;
	public int courseId = 103012;

	private void doPrivate() {
		System.out.println("This is Private Access Modifires :");
		System.out.println(rollNo);
	}

	void doDefault() {
		System.out.println("This is Default Access Modifires :");
		System.out.println(addmisiionNo);
	}

	protected void doProtected() {
		System.out.println("This is Protected Access Modifires :");
		System.out.println(age);
	}

	public void doPublic() {
		System.out.println("This is Public Access Modifires :");
		System.out.println(courseId);
	}
}
