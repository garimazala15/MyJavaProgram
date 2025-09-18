package garima.PracticeProject2;

public class SumOfArray {
	
	public static void main(String[] args) {
		int arr[]= {4,5,6,7,8,9};
		int i,sum;
		for(i=0,sum=0;i<arr.length;sum=sum+arr[i],i++);
		System.out.println("sum of array element is : " + sum);
			 
			 
	}

}
