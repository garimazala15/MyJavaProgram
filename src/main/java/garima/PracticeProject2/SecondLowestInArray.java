package garima.PracticeProject2;

public class SecondLowestInArray {
	
	public static int secondLowest(int a[]) {
		int n=a.length;
		int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(a[i]<min1)
				min1=a[i];
		}
		for(int i=0;i<n;i++) {
			if(a[i]<min2 && a[i]!=min1)
				min2=a[i];
		}
		return min2;
		
	}
	
	 public static void main(String[] args) {
		int a[]= {45,60,12,25,80,2,27};
		System.out.println("second lowest element in array is : " + secondLowest(a));
		
	}

}
