package smartgraduates;

import java.util.Scanner;

public class PensionCalculator {
	public static void main(String[] args) {
		
		final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
		final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
	    final double EMPLOYEE_RATE_55_TO_60 = 0.13;
	    final double EMPLOYER_RATE_55_TO_60 = 0.13;
	    final double EMPLOYEE_RATE_60_TO_65 = 0.075;
	    final double EMPLOYER_RATE_60_TO_65 = 0.09;
	    final double EMPLOYEE_RATE_65_ABOVE = 0.05;
	    final double EMPLOYER_RATE_65_ABOVE = 0.075; 
		
		int salary,age,contributablesalary;
		double employeecontribution,employerscontribution,totalcontribution;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your Salary : ");
		salary=scan.nextInt();
		
		System.out.println("Enter Your Age : ");
		age=scan.nextInt();
		
		contributablesalary=(salary<=6000)? salary:6000;
	
		if(age<=55) {
			employeecontribution=contributablesalary*EMPLOYEE_RATE_55_AND_BELOW;
			employerscontribution=contributablesalary*EMPLOYER_RATE_55_AND_BELOW;
		}
		else if(age>60) {
			employeecontribution=contributablesalary*EMPLOYEE_RATE_55_TO_60;
			employerscontribution=contributablesalary* EMPLOYER_RATE_55_TO_60;
		}
		else if(age<=65) {
			employeecontribution=contributablesalary* EMPLOYEE_RATE_60_TO_65;
			employerscontribution=contributablesalary*EMPLOYER_RATE_60_TO_65;
		}
		else {
			employeecontribution=contributablesalary*EMPLOYEE_RATE_65_ABOVE;
			employerscontribution=contributablesalary*EMPLOYER_RATE_65_ABOVE;
		}
		
		totalcontribution=employeecontribution+employerscontribution;
		
		System.out.printf("The Employees Contribution : %.2f\n" , employeecontribution);
		System.out.printf("The Employers Contribution : %.2f\n ",employerscontribution);
		System.out.printf("The Total Contribution is : %.2f ",totalcontribution);
	}
}