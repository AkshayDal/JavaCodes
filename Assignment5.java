package com.assignment;

public class Assignment5 {
	
	static void sub(int a, int  b)
	{
		if(a < b)
		{
			System.out.println("Provide the value of a greater than b to get the positive results");
		}
		else
		{
			int c = a - b;
			System.out.println("Substraction is : " + c);
		}
		
	}

	public static void main(String[] args) {
		
		sub(4, 2);
	}

}
