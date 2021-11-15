package com.Pages;

import org.apache.poi.ss.formula.functions.Count;

public class NumberSwapping {
	
	public void swapNumbers() {
		
		int x = 10 , y =20;
		
		System.out.println("Value of X before swapping is " + x  + " "  );
		System.out.println("Value of Y before swapping is " + y  + " "  );
		
		
		x= x+y;
		y=x-y;
		x=x-y;
		
		
		System.out.println("Value of X after swapping is " + x  + " "  );
		System.out.println("Value of Y after swapping is " + y  + " "  );
		
		
		
	}
	
	

	public static void main(String[] args) {
		NumberSwapping NSS = new NumberSwapping();
		NSS.swapNumbers();
		
	}

}
