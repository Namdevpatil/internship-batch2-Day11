package com.problemsWithJavaArrays;

public class Example1 
{

	public static void main(String[] args) {

		int customerAges[] = {29, 56, 33};

		for(int i = 0; i < customerAges.length; i++)
		{
			System.out.println(customerAges[i]);
		}

		System.out.println("------------------------------");

		//Variable must provide either dimension expressions or an array initializer
		int customersAges[] = new int[3];//array object

		//array initialization
		customersAges[0] = 67;
		customersAges[1] = 30;
		customersAges[2] = 49;

		for(int i = 0; i < customersAges.length; i++)
		{
			System.out.println(customersAges[i]);
		}

	}

}
