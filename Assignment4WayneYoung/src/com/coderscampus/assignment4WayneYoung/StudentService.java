package com.coderscampus.assignment4WayneYoung;

public class StudentService {
	public static Student createStudent(String studentId, String studentName, String studentCourse, int studentGrade) {
		Student student = new Student(studentId, studentName, studentCourse, studentGrade);
		student.setStudentId(studentId);
		student.setStudentName(studentName);
		student.setStudentCourse(studentCourse);
		student.setStudentGrade(studentGrade);
		return student;
	}

}
