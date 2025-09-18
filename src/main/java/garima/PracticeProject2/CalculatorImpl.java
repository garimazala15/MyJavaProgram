package garima.PracticeProject2;

import java.util.Scanner;

class Calculator{
	 
	private double a,b;
	public void setData(double a,double b) {
		this.a=a;
		this.b=b;
		
	}
	public double add() {
		return this.a+this.b;
	}
	public double sub() {
		return this.a-this.b;
	}
	public double multi() {
		return this.a*this.b;
	}
	public double div() {
		if(b==0) {
			System.out.println("Divide by zero is not allowed");
		}
		return this.a/this.b;
	}
	public double mod() {
		return this.a%this.b;
	}
	public double pow() {
		return Math.pow(a, b);
	}
	public double sqrt() {
		return Math.sqrt(a);
	}

}

public class CalculatorImpl {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 Calculator c1=new Calculator();
		 int choice;
		 do {
			 System.out.println("\n===== Calculator menu =======");
			 System.out.println("1.Addition");
			 System.out.println("2.Substraction");
			 System.out.println("3.Multiplication");
			 System.out.println("4.Division");
			 System.out.println("5.Modulus");
			 System.out.println("6.power(a^b)");
			 System.out.println("7.square root of a");
			 System.out.println("8.Exit");
			 System.out.println("Enter your choice:");
			 choice=sc.nextInt();
			 
			 if(choice>=1 && choice<=6) {
				 System.out.println("Enter first no:");
				 double a=sc.nextDouble();
				 System.out.println("Enter second no:");
				 double b=sc.nextDouble();
				 c1.setData(a, b);
			 }else if(choice==7) {
				 System.out.println("Enter a no:");
			     double a=sc.nextDouble();
			     c1.setData(a,0);
			 }
			 switch(choice) {
			 case 1:
				 System.out.println("Result="+c1.add());
				 break;
			 case 2:
				 System.out.println("Result="+c1.sub());
				 break;
			 case 3:
				 System.out.println("Result="+c1.multi());
				 break;
			 case 4:
				 System.out.println("Result="+c1.div());
				 break;
			 case 5:
				 System.out.println("Result="+c1.mod());
				 break;
			 case 6:
				 System.out.println("Result="+c1.pow());
				 break;
			 case 7:
				 System.out.println("Result="+c1.sqrt());
				 break;
			default:
				System.out.println("Invalid choice,please try again.");
			 }
			 
		 }while(choice!=8);
		
	}
}
