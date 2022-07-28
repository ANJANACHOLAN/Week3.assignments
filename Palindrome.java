package assignment.week3;

public class Palindrome {

	public static void main(String[] args) {
		String value = "madam";//Declaring the input
		String rev = "";
		
		char[] charArray = value.toCharArray();//string to char array
		
		
		for (int i =charArray.length-1; i>= 0;  i--) {
		rev=rev+value.charAt(i);//add characters in reverse
		    		}
		System.out.println(rev);
		if(value.equals(rev))//condition 
			System.out.println("It is a Palindrome");
		else
			System.out.println("It is not a Palindrome");
	}}