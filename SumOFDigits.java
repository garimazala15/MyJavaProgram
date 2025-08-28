import java.util.Scanner;
class Sum_OF_Digits{
               public static void main(String[]args){
                          Scanner sc=new Scanner(System.in);
                          System.out.println("enter the no:");
                          int n=sc.nextInt();
                          int r,sum=0;
                          while(n!=0){
                            r=n%10;
                            sum+=r;
                            n=n/10;
                          }
                          System.out.print("Sum of digit is : " + sum);

    }
}