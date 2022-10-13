/*
 * 2.	Write a method reverse() that receives a string str as a parameter and returns the characters
 *  in str in reverse order. Thus, if the value sent to reverse() is "I me ", the method returns " em I".
 */
package main.java.com;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string to reverse : ");
        String str = sc.nextLine();
        
        String rev = reverse(str); 
        System.out.println("Reversed sentence: " + rev);
        
        sc.close();
  }

	 // method to reverse the string
    public static String reverse(String str) {
   
    char[] arr = str.toCharArray();
    String a = " ";
		 
		 for(int i = (char)( arr.length-1); i>=0; i--) {
			a = a + String.valueOf(arr[i]);  //Convert the array of character to string
		 }
    
		return a;
		
    }
}