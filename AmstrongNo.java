import java.util.Scanner;
class Amstrong_No{
            public static void main(String []args){
                   Scanner sc=new Scanner(System.in);
                   System.out.print("enter the no:");
                   int n=sc.nextInt();
                   int m,k,sum=0;
                   int count=0;
                   k=n;
                   //counting the digits in no
                   while(k>0){
                       count++;
                       k=k/10;
                   }
                   m=n;
                   while(m>0){
                      int r=m%10;
                      int i=1,pow=1;
                        while(i<=count){
                             pow=pow*r;
                             i++;
                        }
                        sum=sum+pow;
                        m=m/10;
                   }
                   if(sum==n)
                           System.out.println("no is amstrong");
                   else
                           System.out.println("no is not amstrong");

                   
            
  }
}