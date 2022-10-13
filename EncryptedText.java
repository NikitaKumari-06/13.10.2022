package main.java.com;

public class EncryptedText {
	
	//private fields
		private int key;
		private String text;
		
		//constructor
		//parametrized construcotr
		public EncryptedText(String text) {
			key=0;
			this.text =text;
		}
		
		//encode the given text with the key provided 
		public EncryptedText(String text, int key) {
			this.key = key;
			this.text = encode(text,key);
		}
		
		//return of the encrypted text
		public String getEncryptedText() {
			return text;
		}
		
		//return of decrypted text
		public String getDecryptedText(int key) {
			if(key == this.key)
				return decode(this.text,key);
			else
				return null;
		}
		//verification of the correctness of an encryption key
		public boolean isKey(int candidateKey) {
			return candidateKey == key;
		}
		
		
		//again encode the decoded text with newKey provided
		public void setKey(int key , int newKey) {
			if(key == this.key) {
				this.key = newKey;
				text = encode(decode(text,key) , newKey);
			}
		}
		

		//encode method
		private static String encode(String text, int key) {
			String resText = "";
			char c;
			int ci;
			for(int i=0;i<text.length();i++) {
				c  = text.charAt(i);
				ci = (int)c;
				ci = ci +key;
				c = (char)ci;
				resText =resText + String.valueOf(c);
			}
			return resText;
		}
		//decode method
		private static String decode(String text, int key) {
			String resText = "";
			char c;
			int ci;
			for(int i=0;i<text.length();i++) {
				c  = text.charAt(i);
				ci = (int)c;
				ci = ci - key;
				c = (char)ci;
				resText =resText + String.valueOf(c);
			}
			return resText;
		}
}
