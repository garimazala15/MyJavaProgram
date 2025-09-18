package garima.PracticeProject2;

import java.util.Arrays;

public class MinElementOfArray {
	public static void main(String[] args) {
		int arr[]= {45,67,25,80,2};
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("min element of array is : " + min);
	}
}
