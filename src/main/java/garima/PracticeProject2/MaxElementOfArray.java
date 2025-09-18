package garima.PracticeProject2;

import java.util.Scanner;

public class MaxElementOfArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements of array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int j=1;j<arr.length;j++) {
			if(arr[j]>max)
				max=arr[j];
		}
		System.out.println("Max element of array is : " + max);
	}

}