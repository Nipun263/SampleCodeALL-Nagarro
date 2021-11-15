package com.Pages;

public class ReverseString {
	
	
	public void reverseString(String input) {
		String s = input ;
		
	char charArray[] = input.toCharArray();
	
	for(int i = charArray.length-1 ; i >=0 ; i --) {
		System.out.print(charArray[i]);
	}
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		ReverseString CS = new ReverseString();
		CS.reverseString("Nipun Verma");
	}

}


