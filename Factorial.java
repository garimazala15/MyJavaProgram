import java.util.Scanner;
class Factorial_Of_No{
               public static void main(String[]args){
                          Scanner sc=new Scanner(System.in);
                          System.out.println("enter the no:");
                          int n=sc.nextInt();
                          int i,fact;
                          for(i=1,fact=1;i<=n;fact=fact*i,i++);
                          System.out.print("Factorial is : " + fact);
     }
}