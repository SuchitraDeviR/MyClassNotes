package week1.day1;

import week1.day2.LearnMethods;

public class HelloSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 10;
		char initial = 'R';
		boolean executionStatus = true;
		String firstName="Suchitra Devi";
		float mileage = 10.5f;
		double totalCarMileage = 12900;
		System.out.println("Welcome to Selenium Java class");
		System.out.println("Your age : "+ age);
		System.out.println("Your initial : "+ initial);
		System.out.println("Your executionStatus : "+ executionStatus);
		System.out.println("Your firstName : "+ firstName);
		System.out.println("Your mileage : "+ mileage);
		System.out.println("Your totalCarMileage : "+ totalCarMileage);
		
		System.out.println("---------------------------------------------------------");
		
		LearnMethods bi=new LearnMethods();
		System.out.println(bi.Bicycle());
	}

}
