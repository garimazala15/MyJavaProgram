package garima.PracticeProject2;

class Swaping{
	private int a,b;
	
	public void setData(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	/*
	 * public void swap() { int temp; temp=this.a; this.a=this.b; this.b=temp; }
	 */
	
	public void swap() {
		this.a=this.a+this.b;        //10+20=30
		this.b=this.a-this.b;       //30-20=10
		this.a=this.a-this.b;      //30-10=20
	}
	
	public void display() {
		System.out.println("A="+ this.a+" B=" + this.b);
	}
	
}

public class SwappingImpl {
	
	public static void main(String[] args) {
		Swaping sw=new Swaping();
		sw.setData(10,20);
		System.out.println("Before swapping :");
		sw.display();
		sw.swap();
		System.out.println("After swapping:");
		sw.display();		
	}
	
	

}
