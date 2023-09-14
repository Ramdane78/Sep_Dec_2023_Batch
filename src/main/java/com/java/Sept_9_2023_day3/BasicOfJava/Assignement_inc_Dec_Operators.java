package com.java.Sept_9_2023_day3.BasicOfJava;

public class Assignement_inc_Dec_Operators {

	public static void main(String[] args) {
		
		int a = 2; //latest value of a is 2
		
		int b = a-- - --a + a++ + --a + ++a;
		
		//b = 2 - 0 + 0 + 0 +1 =3
		//a = 1, 0, 1, 0, 1
		
		System.out.println(a); // a=1	
		System.out.println(b);  // b=3
		
		int i =10; //latest value of i is 10
		int j = i--; 
		// j = 10// latest value of j 10
		// i = 9  // latest value of i is 9
		int k = --j + j++;
		// k = 8     +10 = latest value of k is 18
		int l = i++ - --k - --j + j++;

		System.out.println("i"); 
		System.out.println("j"); 
		System.out.println("k"); 
		System.out.println("l"); 
	}

}
