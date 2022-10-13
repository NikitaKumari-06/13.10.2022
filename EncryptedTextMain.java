package test.java.com;

import java.util.Scanner;

import main.java.com.EncryptedText;

public class EncryptedTextMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the text: ");
		String text= sc.nextLine();
		
		//creation of new object 
		EncryptedText t = new EncryptedText(text, 10);
		
		//print decrypted text
	    System.out.println(t.getDecryptedText(10));
	    
	    //print encrypted text
	    System.out.println(t.getEncryptedText());
	   
	    System.out.println("********");
	    
	    //passing new key
	    t.setKey(10, 20);
	    
	    //again print decrypted text
	    System.out.println(t.getDecryptedText(20));
	    
	    //again encrypt the encrypted text
	    System.out.println(t.getEncryptedText());
	    
	    sc.close();
	
	}

}
