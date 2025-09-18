package garima.PracticeProject2;

class Height{
	
	private int f,i;
	
	public void setData(int f,int i) {
		this.f=f;
		this.i=i;
	}
	
	public void addHeight(Height x, Height y) {
		this.f=x.f+y.f;
		this.i=x.i+y.i;
		if(i>=12) {
			this.f=this.f+this.i/12;
			this.i%=12;
		}
	}
	
	public void display() {
		System.out.print("Feet= " + this.f);
		System.out.println(" Inches= " + this.i);
	}
}
public class HeightImpl {
	public static void main(String[] args) {
		Height h1=new Height();
		Height h2=new Height();
		Height h3=new Height();
		h1.setData(6,7);
		h1.display();
		h2.setData(7, 9);
		h2.display();
		h3.addHeight(h1, h2);
		h3.display();
	}

}
