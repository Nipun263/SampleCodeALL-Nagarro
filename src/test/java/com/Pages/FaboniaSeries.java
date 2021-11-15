package com.Pages;

public class FaboniaSeries {
	
	
	public void verifyFaboniaSeries() {
		
		int a = 0 , b = 1 , c , count = 1000;
	
		System.out.print(a + " " +  b);
		
		for ( int i = 2 ; i <= 1000 ; i ++) {
			c = a + b ;
			a=b;
			b=c;
			
		System.out.print(" " + c);
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		FaboniaSeries FS = new FaboniaSeries();
		FS.verifyFaboniaSeries();
	}

}
