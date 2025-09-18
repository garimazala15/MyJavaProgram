package garima.PracticeProject2;

import java.util.Scanner;

class Area{
	
	private double l,b,r,h,s;
	
	public void setRectangle(double l,double b) {
		this.l=l;
		this.b=b;
	}
	
	public void setCircle(double r) {
		this.r=r;
	}
	
	public void setTraingle(double b,double h) {
		this.b=b;
		this.h=h;
	}
	
	public void setSqaure(double s) {
		this.s=s;
	}
	
	public void setCube(double s) {
		this.s=s;
	}
	
	public double areaOfRec(double l,double b) {
		return l*b;
	}
	
	public double areaOfCircle(double r) {
		return Math.PI*r*r;
	}
	
	public double areaOfTriangle(double b,double h) {
		return 0.5*l*b;
	}
	
	public double areaOfSquare(double s) {
		return s*s;
	}
	
	public double areaOfCube(double s) {
		return 6*s*s;
	}
	
	public double circumOfCircle(double r) {
		return 2*Math.PI*r*r;
	}
	
	public double circumOfRec(double l,double b) {
		return 2*(l+b);
	}
}

public class AreaImpl {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Area area=new Area();
		int ch;
		do {
			System.out.println("Choose an option");
			System.out.println("1.Area of Rectangle");
			System.out.println("2.Area of Circle");
			System.out.println("3.Area of Triangle");
			System.out.println("4.Area of Square");
			System.out.println("5.Area of Cube");
			System.out.println("6.Circumference of Circle");
			System.out.println("7.Circumference of Rectangle");
			System.out.println("Enter your choice : ");
			ch=sc.nextInt();
			switch(ch) {
			    
			case 1:
				System.out.println("Enter the length");
				double l=sc.nextDouble();
				System.out.println("Enter the breadth");
				double b=sc.nextDouble();
				area.setRectangle(l, b);
				System.out.println("area of rectangle is : " + area.areaOfRec(l, b));
				break;
				
		    case 2:
			   System.out.println("Enter the radius");
			   double r=sc.nextDouble();
			   area.setCircle(r);
			   System.out.println("area of circle is : " + area.areaOfCircle(r));
			   break;
		    case 3:
				   System.out.println("Enter the breadth");
				   b=sc.nextDouble();
				   System.out.println("Enter the height");
				   double h=sc.nextDouble();
				   area.setTraingle(b, h);
				   System.out.println("area of triangle is : " + area.areaOfTriangle(b, h));
				   break;
		    case 4:
				   System.out.println("Enter the side");
				   double s=sc.nextDouble();
				   area.setSqaure(s);
				   System.out.println("area of square is : " + area.areaOfSquare(s));
				   break;
		    case 5:
				   System.out.println("Enter the side");
				   s=sc.nextDouble();
				   area.setCube(s);
				   System.out.println("area of cube is : " + area.areaOfCube(s));
				   break;
		    case 6:
				   System.out.println("Enter the radius");
				   r=sc.nextDouble();
				   area.setCircle(r);
				   System.out.println("circumference of circle is : " + area.circumOfCircle(r));
				   break;
		    case 7:
				   System.out.println("Enter the length");
				   l=sc.nextDouble();
				   System.out.println("Enter the breadth");
				   b=sc.nextDouble();
				   area.setRectangle(l, b);
				   System.out.println("circumference of rectangle is : " + area.circumOfRec(l, b));
				   break;
		    case 8:
		    	System.out.println("Exiting....");
		    	break;
		    default:
		    	System.out.println("Invalid choice,try again.");
}
			}while(ch!=8);
		
		
	}

}
