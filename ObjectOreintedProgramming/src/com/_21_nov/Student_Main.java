package com._21_nov;

import java.util.Arrays;

class Student {
	private String name;
	private int age;
	private String gender;
	private int[] grades;
	private String major;

	public Student(String name, int age, String gender, int[] grades, String major) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.grades = grades;
		this.setMajor(major);
	}

	public double getAverageGrade() {
		if (grades.length == 0) {
			return 0.0;
		}
		int sum = 0;
		for (int grade : grades) {
			sum += grade;
		}
		return (double) sum / grades.length;
	}

	public boolean isPassing() {
		return getAverageGrade() >= 70;
	}

	public static double getMajorGradeAverage(Student[] students) {
		if (students.length == 0) {
			return 0.0;
		}
		int sum = 0;
		int count = 0;
		for (Student student : students) {
			sum += student.getAverageGrade();
			count++;
		}
		return (double) sum / count;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", grades=" + Arrays.toString(grades)
				+ ", major=" + major + "]";
	}

}

class University {
	private Student[] students;
	private int studentCount;

	public University(int maxSize) {
		this.students = new Student[maxSize];
		this.studentCount = 0;
	}

	public void addStudent(Student student) {
		if (studentCount < students.length) {
			students[studentCount++] = student;
		} else {
			System.out.println("Cannot add more students. University is full.");
		}
	}

	public Student[] getStudentsByMajor(String major) {
		Student[] studentsInMajor = new Student[studentCount];
		int count = 0;
		for (int i = 0; i < studentCount; i++) {
			if (students[i].getMajor().equals(major)) {
				studentsInMajor[count++] = students[i];
			}
		}
		return studentsInMajor;
	}

	public Student[] getPassingStudentsByMajor(String major) {
		Student[] passingStudentsInMajor = new Student[studentCount];
		int count = 0;
		for (int i = 0; i < studentCount; i++) {
			if (students[i].getMajor().equals(major) && students[i].isPassing()) {
				passingStudentsInMajor[count++] = students[i];
			}
		}
		return passingStudentsInMajor;
	}

	public Student[] getTopStudentsByMajor(String major, int n) {

		Student[] studentsInMajor = getStudentsByMajor(major);
		Student[] topStudents = new Student[Math.min(n, studentCount)];
		System.arraycopy(studentsInMajor, 0, topStudents, 0, topStudents.length);
		for (int i = 0; i < topStudents.length - 1; i++) {
			for (int j = i + 1; j < topStudents.length; j++) {
				if (topStudents[j].getAverageGrade() > topStudents[i].getAverageGrade()) {
					Student temp = topStudents[i];
					topStudents[i] = topStudents[j];
					topStudents[j] = temp;
				}
			}
		}
		return topStudents;
	}
}

public class Student_Main {

	public static void main(String[] args) {

		int arr[] = { 91, 89, 79, 97 };

		Student s1 = new Student("Faizan", 20, "male", arr, "Computer science");

//		Student[] student = { s1 };

		University u = new University(10);
		u.addStudent(s1);
		Student[] studentsByMajor = u.getStudentsByMajor("Computer science");
		Student[] passingStudentsByMajor = u.getPassingStudentsByMajor("Computer science");
		Student[] topStudentsByMajor = u.getTopStudentsByMajor("computer Science", 0);

		System.out.println(studentsByMajor);
		System.out.println(passingStudentsByMajor);
		System.out.println(topStudentsByMajor);

	}

}
