package ca.ucalgary.ensf380;
import java.util.regex.*;

public class Professor extends Person {
	private String teacherNumber;
	private double salary;
	
	//constructor
	Professor(String ID, double salary) {
		this.setSalary(salary);
		this.setTeacherNumber(ID);
	}
	
	//setters and getters
	public void setTeacherNumber(String ID) {
		/* validate that the teacher ID is in the format
		 * ^[A-Z]{1}\d[A-Z]{1}$ or Letter-3Numbers-Letter.
		 */
		if (Pattern.compile("^[A-Z]{1}[0-9]{3}[A-Z]{1}$").matcher(ID).find()) {
			this.teacherNumber = ID;
		} else {
			return;
		}
		
	}
	public void setSalary(double salary) {
		//convert to string to check decimal amount <= 2 decimals
		String salaryString = Double.toString(salary);
		if (Pattern.compile("^[0-9]*[.]{1}[0-9]{2}$").matcher(salaryString).find()) {
			this.salary = salary;
		} else {
			return;
		}
		
		
		this.salary = salary;
	}
	public double getSalary() {
		return this.salary;
	}
	public String getTeacherNumber() {
		return this.teacherNumber;
	}
}
