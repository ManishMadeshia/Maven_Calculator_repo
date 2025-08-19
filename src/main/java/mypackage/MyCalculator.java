package mypackage;

public class MyCalculator {

	public int sum(int a, int b) 
	{
		return a+b;
	}
	public int diff(int a, int b) 
	{
		return a-b;
	}
	
	
	public static void main(String[] args) {
		MyCalculator calc = new MyCalculator();
		System.out.println("sum is "+ calc.sum(10,20));
		System.out.println("sum is "+ calc.diff(10,20));

	}
}
