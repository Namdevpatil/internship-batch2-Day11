package com.problemsWithJavaArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example4 {

	public static void main(String[] args) {
		
		
		List<Integer> values = new ArrayList<Integer>();
		
		values.add(2920);
		values.add(7865);
		values.add(3344);
		values.add(2233);
		
		
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
		
		System.out.println("=======================================");
		
		Collections.sort(values);
		
		for(int i = 0; i < values.size(); i++)
		{
			System.out.println(values.get(i));
		}
		
	}

}
