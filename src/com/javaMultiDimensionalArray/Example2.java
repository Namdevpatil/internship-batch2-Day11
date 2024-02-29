package com.javaMultiDimensionalArray;

public class Example2 {

	public static void main(String[] args) {
		
		//2.one dimensional array declare and initialize in multiple statements/lines
		
		//array declare
		int customerAges[] = new int[3];//array object
		
		//array initialization
		customerAges[0] = 67;
		customerAges[1] = 30;
		customerAges[2] = 49;
		
		for(int i = 0; i < customerAges.length; i++)
		{
			System.out.println(customerAges[i]);
		}
	}

}
