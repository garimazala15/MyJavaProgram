import java.util.Scanner;
class Fabonacii_Of_No{
                 public static void main(String []args){
                   Scanner sc=new Scanner(System.in);    
                   System.out.print("enter the no:");
                   int n=sc.nextInt();
                   int a=0,b=1,c;
                   System.out.print("Fibonacci Series: ");
                   for(int i=0;i<=n;i++){
                      System.out.print(a+" ");
                      c=a+b;
                      a=b;
                      b=c;
                   }
                  
                      
        
}
}
