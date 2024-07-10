package Test;

import java.util.Iterator;

public class Self {

	public static void main(String[] args) {
		
	String str="education";
	
	int count=0;
	
	for (int i = 0; i < str.length(); i++) {
		
		
		char ch =str.charAt(i);
		
		switch(ch) {
		
		
		case 'a':
		case 'e':	
		case 'i':
		case 'o':
		case 'u':
			count++;
		
		
		
		}
		
		if (count==0) {
			System.out.println("vowels not present");
			
		} else {
			System.out.println("vowels are present");

		}
	}
	System.out.println("The number of vowels"+count);
		
		
}}
