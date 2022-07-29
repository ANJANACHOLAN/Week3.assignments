package assignment.week3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";//Declaring the iput
		String text2 = "potss";
		
		int a = text1.length(); //Extracting the length
		int b = text2.length();
	
		if(a==b) { //condition for comparing the length
	System.out.println("It is a Anagram");
	}
	else 
		System.out.println("It is not a Anagram");
			
		char[] a1 = text1.toCharArray();//string to charArray
		char[] b1 = text2.toCharArray();
		
		Arrays.sort(a1);//Sorting the string array
		System.out.println(a1);
		Arrays.sort(b1);
		System.out.println(b1);
		
		if(a1.equals(b1)) //condition to compare the values
		{
			System.out.println("The values are same");
		}
		else {
			System.out.println("The values are not equal");
		}
	
}
	
	
}


