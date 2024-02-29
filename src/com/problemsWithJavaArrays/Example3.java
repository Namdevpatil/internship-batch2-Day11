package com.problemsWithJavaArrays;

import java.util.ArrayList;
import java.util.List;

public class Example3 {

	public static void main(String[] args) {
		
		
		List values = new ArrayList();
		
		values.add(2920);
		values.add(7865);
		values.add(3344);
		values.add(2233);
		values.add("Ganesh");
		values.add(456.34);
		values.add(true);
		
		for(int i = 0; i < values.size(); i++)
		{
			System.out.println(values.get(i));
		}
		
		System.out.println("--------------------------");
		
		System.out.println(values.size());
		
		System.out.println("=======================================");
		
		values.remove(2);
		
		for(int i = 0; i < values.size(); i++)
		{
			System.out.println(values.get(i));
		}
		
		System.out.println("--------------------------");
		
		System.out.println(values.size());
		
	}

}
