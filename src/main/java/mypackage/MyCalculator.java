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
	
	public int mult(int a, int b) 
	{
		return a*b;
	}
	public int div(int a, int b) 
	{
		return a/b;
	}
	
	public int mod(int a, int b) 
	{
		return a%b;
	}
	public int mul(int a, int b) 
	{
		return a*b;
	}
	
	
	public static void main(String[] args) {
		MyCalculator calc = new MyCalculator();
		System.out.println("sum is "+ calc.sum(10,20));
		System.out.println("diff is "+ calc.diff(10,20));
		System.out.println("mult is "+ calc.mult(10,20));
		System.out.println("div is "+ calc.div(10,20));
		System.out.println("mod is "+ calc.mod(10,20));
		System.out.println("mul is "+ calc.mul(10,20));
	}
}
