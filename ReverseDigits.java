import java.util.Scanner;
class Reverse_Of_Digits{
             public static void main(String []args){
             Scanner sc=new Scanner(System.in);
             System.out.print("Enter the no:");
             int n=sc.nextInt();
             int rev=0;
             while(n!=0){
                 int digit=n%10;
                 rev=rev*10+digit;
                 n=n/10;
              }
           System.out.print("Reverse Of Digit is : " + rev);
    }
}