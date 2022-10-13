/*
 * 3.	Take a sentence as a user input. 
Break up the sentence into words.
Sort the words based on the length of the word - and print out.
Example: If user inputs the sentence: "Hi, welcome to this mentoring session", the output should be:
to
Hi,
this
welcome
session
mentoring
 */
package main.java.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextSort {
	public static void main(String[] args) { 
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a string : ");
	String str = sc.nextLine() + " ";
	
		ArrayList<String> list = new ArrayList<String>(); 
		 
		char[] charArray = str.toCharArray(); 
		
		String temp = " "; 
 
		//Split the given text when spaces occurs and add it in list
		for (int i = 0; i < charArray.length; i++) { 
			if (charArray[i] != ' ') { 
				temp = temp + charArray[i]; 
			} 
			
			else { 
				list.add(temp); 
				temp = " "; 
			} 
		} 
 
		//Add the list element to String array
		String[] arr=new String[list.size()];
		
		 for (int i = 0; i < list.size(); i++) {
	         arr[i] = list.get(i);
	     }
		 int len = arr.length;
		  
		 System.out.println("****************************************************************");
		 String text = sortString(arr,len);     //calll of the method sortString
		 System.out.println("Sorted text : " + text);
		 sc.close();
		   
		} 

	
		public static String sortString(String []s, int n)
		{
		    for (int i=1 ;i<n; i++)
		    {
		        String temp = s[i];
		 
		        // Insert s[j] at its correct position
		        int j = i - 1;
		        //Compare the length to sort
		        while (j >= 0 && temp.length() < s[j].length())
		        {
		            s[j+1] = s[j];
		            j--;
		        }
		        s[j+1] = temp;
		    }
		
		    //Print the sorted string in according to their length
			String str = " ";
		    for (int i=0; i<n; i++) {
		    	 str= str+"\n "+s[i];
			}
			  
		  return  str;
		    
		}	 
}