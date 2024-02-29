package com.javaOneDimensionalArray;

public class Example1 {

	public static void main(String[] args) {
		
		//1. multidimensional array declare and initialize in one statement/line
		int matrix[][] = {{29, 56},{55, 33}};
		
		for(int i = 0; i < matrix.length; i++)//row
		{
			for(int j = 0; j < matrix.length; j++)//row
			{
				System.out.print(matrix[i][j]+ "\t");
			}
			System.out.println("\n\n");
		}
	}

}
