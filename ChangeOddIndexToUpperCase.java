package assignment.week3;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		 String test = "changeme"; //input
		 char[] charArray = test.toCharArray();//change to chararray
		 int length = test.length();//length of the string
		
		for(int i=0; i<length; i++)//odd to uppercase
		 {
			if(i%2==0) {
				System.out.println(test.substring(i, i+1).toUpperCase());
			}
			else
				System.out.println(test.substring(i,i+1).toLowerCase());
		 }
			
}}
