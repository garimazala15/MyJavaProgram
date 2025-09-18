 package garima.PracticeProject2;

 class Time{
	private int h,m,s;
	
	public void setData(int h,int m,int s) {
		this.h=h;
		this.m=m;
		this.s=s;
	}
	
	public void display() {
		System.out.print("Hours= " + this.h);
		System.out.print(" minutes= " + this.m);
		System.out.println(" seconds= " + this.s);
	}
	
	public void addTime(Time k1,Time k2) {
		this.h=k1.h+k2.h;
		this.m=k1.m+k2.m;
		this.s=k1.s+k2.s;
		
		if(s>=60) {
			this.m=this.m + this.s/60;
			this.s=this.s%60;
		}
		if(m>=60) {
			this.h=this.h + this.m/60;
			this.m%=60;
		}

	}
	
	 
 }
public class TimeImpl {
	public static void main(String[] args) {
		Time t1=new Time();
		Time t2=new Time();
		Time t3=new Time();
		t1.setData(2,145,55);
		t2.setData(3,55,155);
		t1.display();
		t2.display();
		t3.addTime(t1, t2);
		t3.display();
	}

}
