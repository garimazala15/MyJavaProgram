package com.garima.Pattern;

public class SquareHollowPattern {
	public static void main(String[] args) {
		
		int col=5,row=6;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				if(i==1 || i==row || j==1 || j==col) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
