package com.javaOneDimensionalArray;

public class Example2 {

	public static void main(String[] args) {

		//2. multidimensional array declare and initialize multiple statements/lines
		int matrix[][] = new int[2][2];

		matrix[0][0] = 1;
		matrix[0][1] = 0;
		matrix[1][0] = 0;
		matrix[1][1] = 1;

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
