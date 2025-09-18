package garima.PracticeProject2;

public class SecondLargestInArray {
	
	public static int secondLargest(int a[]) {
		int n=a.length;
		int larg1=-1,larg2=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]>larg1)
				larg1=a[i];
		}
		
		for(int i=0;i<n;i++) {
			if(a[i]>larg2 && a[i]!=larg1)
				larg2=a[i];
		}
		return larg2;
		
		
	}
	public static void main(String[] args) {
		int a[]= {85,60,25,89,2,27};
		System.out.println("Second largest element of array is : " + secondLargest(a));
	}

}
