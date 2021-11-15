package com.Pages;

import java.util.ArrayList;
import java.util.Iterator;

public class ABCDFFD {
	
	
	
	public void ARR() {
		ArrayList<Object> AA = new ArrayList<Object>();
		AA.add("Volwo");
		AA.add("Toyota");
		AA.add("Kia");
		AA.add("Maruti");
		
		
		int size = AA.size();
		
		for ( int i = 0 ; i <= size ; i ++) {
			String value = AA.get(i).toString();
			String value1 = AA.get(i).toString();
		}
		
			Iterator<Object> IT = AA.iterator();
			IT.hasNext();
			
			IT.next();
		
	}
	
	
	public void Pyramid() {
		
		for (int i = 0 ; i <=10 ; i ++) {
			for (int j = 0 ; j <i ; j ++) {
				
				System.out.print(" " + "*");
			}
			System.out.println();
			}
		}
		
	
	
	
	
	public static void main(String[] args) {
		ABCDFFD DD = new ABCDFFD();
		//DD.ARR();
		DD.Pyramid();
		
	}

}
