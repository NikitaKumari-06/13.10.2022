/*
 * 2.	Write a method reverse() that receives a string str as a parameter and returns the characters
 *  in str in reverse order. Thus, if the value sent to reverse() is "I me ", the method returns " em I".
 */
package main.java.com;

public class StringReverse {
	public static void main(String[] args) {
        String str = "I am Nikita";
        String rev = reverse(str);
        System.out.println("Reversed sentence: " + rev);
  }

	 // Finding the index of the whitespaces
    public static String reverse(String s) {
    int x = s.indexOf(" ");
    
    //Base condition
    if(x == -1)
      return s;
      
     //Recursive call
    return reverse(s.substring(x+1)) +" "+ s.substring(0, x);
     }
}