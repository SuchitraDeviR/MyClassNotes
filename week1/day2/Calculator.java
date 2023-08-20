package week1.day2;

public class Calculator {
	private int addTwoNumbers(int num1,int num2)
	{
		return num1+num2;
	}
	
	public float mul(float num1,int num2)
	{
		return num1*num2;
	}
	
	public void sub()
	{
		int num1=10;
		int num2=5;
		int num3 = num1-num2;
		System.out.println("Subtraction of 2 numbers:" + num3);
	}
	
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		System.out.println(cal.addTwoNumbers(25, 12));
	}
	
}
