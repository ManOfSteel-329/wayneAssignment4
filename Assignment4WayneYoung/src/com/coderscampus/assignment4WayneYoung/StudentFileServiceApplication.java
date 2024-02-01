package com.coderscampus.assignment4WayneYoung;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StudentFileServiceApplication   {
	
	public static void main(String[] args) throws FileNotFoundException {
		List<Student> studentList = new ArrayList<>();
		//BufferedReader reader = null;
		
		Scanner scanner = new Scanner(new File("student-master-list.csv"));
		try {
			  //reader = new BufferedReader(new FileReader("student-master-list.csv"));
			scanner.nextLine(); // skip the header
			
			while (scanner.hasNextLine()) {
					String line = scanner.nextLine();
					String[] studentDatas = line.split(",");
					String studentId = studentDatas[0];
					String studentName = studentDatas[1];
					String studentCourse = studentDatas[2];
					int studentGrade = Integer.parseInt(studentDatas[3]);
					
					Student student = StudentService.createStudent(studentId, studentName, studentCourse, studentGrade);
					studentList.add(student);		
			}
			
			Collections.sort(studentList);
//			studentList.forEach(System.out::println);
			System.out.println("\n");
			System.out.println("---Course1 COMSCI.csv---");	
			for(Student student : studentList) {
				if (student.getStudentCourse().contains("COMPSCI")) {
					
					System.out.println(student);
				}
				
			}
			System.out.println("\n");
			System.out.println("---Course2 APMATH.csv---");
			for(Student student : studentList) {
				if (student.getStudentCourse().contains("APMTH")) {	
					System.out.println(student);
				}
				
			}
			System.out.println("\n");
			System.out.println("---Course3 STAT.csv---");
			for(Student student : studentList) {
				if (student.getStudentCourse().contains("STAT")) {	
					System.out.println(student);
				}
				//System.out.println(studentList.size());
			}
									  		
		} finally {
			scanner.close();
		}
		
 
	}

	 
}
