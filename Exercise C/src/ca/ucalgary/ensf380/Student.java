package ca.ucalgary.ensf380;

import java.util.regex.Pattern;

public class Student extends Person {
	private String studentNumber;
	private Professor supervisor;
	private double averageMark;
	
	//constructor
	Student(String ID, double average) {
		this.studentNumber = ID;
		this.averageMark = average;
	}
	//setters & getters
	public void setStudentNumber(String studentNumber) {
		//student ID must have 8 digits
		if (Pattern.compile("^[0-9]{8}$").matcher(studentNumber).find()) {
			this.studentNumber = studentNumber;
		} else {
			return;
		}
	}
	public String getStudentNumber() {
		return this.studentNumber;
	}
	
	public void setSupervisor(Professor prof) {
		this.supervisor = prof;
	}
	public Professor getSupervisor() {
		return this.supervisor;
	}
	
	public void setAverageMark(double numberGrade) {
		this.averageMark = numberGrade;
	}
	public double getAverageMark() {
		return this.averageMark;
	}
	
	public boolean isEligibleToEnroll() {
		/*enrollment eligibility based on logic that
		 * a student must have an average mark greater
		 * than 70% to be eligible to enroll at the university.
		 */
		if (this.averageMark >= 70.0) {
			return true;
		} else {
			return false;
		}
	}
}
