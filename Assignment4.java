package com.assignment;

public class Assignment4 
{
	static void add(int a, int  b)
	{
		int c = a + b;
		System.out.println("Addition is : " + c);
	}
	
	static void sub(int a, int  b)
	{
		int c = a - b;
		System.out.println("Substraction is : " + c);
	}
	
	static void multiply(int a, int  b)
	{
		int c = a * b;
		System.out.println("Multiplication is : " + c);
	}
	
	static void division(int a, int  b)
	{
		double c = a / b;
		System.out.println("Division is : " + c);
	}
	
	static void modulus(int a, int  b)
	{
		double c = a % b;
		System.out.println("Modulus is : " + c);
	}
	
	 
	public static void main(String[] args) 
	{
		add(2,3);
		sub(4, 2);
		multiply(2, 3);
		division(100, 5);
		modulus(100, 5);

	}

}
