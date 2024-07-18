package ca.ucalgary.ensf380;

public class University {
	public static void main(String[] args) {
		//make Gallagher professor
		Person gallagher = new Professor("D421A", 89923.43);
		gallagher.setName("Gallagher Legwork");
		gallagher.setPhoneNumber("587-234-5654");
		gallagher.setEmailAddress("gallagher.legwork@upenacony.com");
		Address gallagherAddress = new Address("913 Sarcar Ave", "Dreamflux", "GD", "Penacony", "P4I8J2");
		gallagher.setAddress(gallagherAddress);
		System.out.println("Professor Gallagher's information:\n"
				+ "Name: "+ gallagher.getName()
				+ "\nNumber: "+ gallagher.getPhoneNumber()
				+ "\nEmail: "+ gallagher.getEmailAddress()
				+ "\nAddress: "+ gallagher.address.outputAsLabel()
				+ "\nID: "+ ((Professor)gallagher).getTeacherNumber()
				+ "\nSalary: "+ ((Professor)gallagher).getSalary());
		
		//Yinxing student
		Person yinxing = new Student("33910979", 82.3);
		((Student)yinxing).setSupervisor((Professor)gallagher);
		yinxing.setName("Yin Xing");
		yinxing.setPhoneNumber("587-487-9136");
		yinxing.setEmailAddress("yin.xing@upenacony.com");
		Address yinxingAddress = new Address("853 Aurum Alley", "Luofu", "CF", "Xianzhou", "I2H9WL");
		yinxing.setAddress(yinxingAddress);
		System.out.println("\nStudent Yin's information:\n"
				+ "Name: "+ yinxing.getName()
				+ "\nNumber: "+ yinxing.getPhoneNumber()
				+ "\nEmail: "+ yinxing.getEmailAddress()
				+ "\nAddress: "+ yinxing.address.outputAsLabel()
				+ "\nID: "+ ((Student)yinxing).getStudentNumber()
				+ "\nSupervisor: "+ gallagher.getName()
				+ "\nAverage: "+ ((Student)yinxing).getAverageMark());
		
		//New student March with wrong email
		Person march = new Student("98437123", 88.5);
		march.setName("March Lancaster");
		march.setPhoneNumber("587-394-1450");
		march.setEmailAddress("march.lancasterupenacony.com");
		Address marchAddress = new Address("340 University Ave NW Bldg. #2", "Calgary", "AB", "Canada", "T3P0B3");
		march.setAddress(marchAddress);
		System.out.println("\nMarch email should be null due to error: "+ march.getEmailAddress()); //show null email on console
		
		//now check if she is eligible to enroll
		System.out.println("check March enrollment eligibility: "+ ((Student)march).isEligibleToEnroll()); //should be true
		((Student)march).setSupervisor((Professor)gallagher);
		march.setEmailAddress("march.lancaster@upenacony.com"); //fix email too
		
		System.out.println("\nStudent March's information:\n"
				+ "Name: "+ march.getName()
				+ "\nNumber: "+ march.getPhoneNumber()
				+ "\nEmail: "+ march.getEmailAddress()
				+ "\nAddress: "+ march.address.outputAsLabel()
				+ "\nID: "+ ((Student)march).getStudentNumber()
				+ "\nSupervisor: "+ gallagher.getName()
				+ "\nAverage: "+ ((Student)march).getAverageMark());
		
		//Increase Gallagher's salary!
		((Professor)gallagher).setSalary(95245.54);
		System.out.println("\nGallagher's new salary: " + ((Professor)gallagher).getSalary());
	}
}
