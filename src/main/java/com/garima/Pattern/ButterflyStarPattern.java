package com.garima.Pattern;

public class ButterflyStarPattern {
	public static void main(String[] args) {
		int n=6;
		//upper part 
		for(int i=1;i<=n;i++) {
			//right side triangle
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			//for space
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
	         //left side triangle
			 for(int j=1;j<=i;j++) { 
				 System.out.print("*"); 
			 }
			 
			System.out.println();
		}
		
		//bottom inverted part 
		for(int i=n;i>=1;i--) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
	
			 for(int j=1;j<=i;j++) { 
				 System.out.print("*"); 
			 }
			 
			System.out.println();
		}
	}

}
