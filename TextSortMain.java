/*
 * 3. Main class of TextSort
 */
package test.java.com;

import java.util.Scanner;

import main.java.com.TextSort;

public class TextSortMain {

	public static void main(String[] args) { 
		TextSort obj = new TextSort();     
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		 //Input text and add space("") in last
		String str = sc.nextLine() + " ";   
		
		//Call of method textToWord
		String[] words = obj.textToWord(str);
		int len = words.length;
		
		System.out.println("******************************************");
		System.out.println("Text to word : ");
		for(String w:words)
			System.out.println(w);
		
		//Call of method sortString
		String sortWord = TextSort.sortString(words, len);
		System.out.println("******************************************");
		System.out.println("Sorted text according to length : " + sortWord );
		
		sc.close();
	}

}
