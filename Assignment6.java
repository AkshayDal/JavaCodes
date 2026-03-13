package com.assignment;

public class Assignment6 {
	
	static void great(int a, int  b)
	{
		if(a < b)
		{
			System.out.println("b is greater than a");
		}
		else
		{
			System.out.println("a is greater than b");
		}
		if(a == b)
		{
			System.out.println("Both the values are same so a is greater than b");
		}
		
	}

	public static void main(String[] args) 
	{
		great(4, 4);
		

	}

}
