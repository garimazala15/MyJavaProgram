import java.util.Scanner;
class Palindrome_No{
             public static void main(String []args){
             Scanner sc=new Scanner(System.in);
             System.out.print("Enter the no:");
             int n=sc.nextInt();
             int rev=0;
             int m=n;
             while(n!=0){
                 int digit=n%10;
                 rev=rev*10+digit;
                 n=n/10;
              }
              if(m==rev)
                 System.out.println("no is palindrome");
              else
                 System.out.println("no is not palindrome");
}
}