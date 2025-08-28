import java.util.Scanner;
class Loops{ 
         public static void main(String []args){
               int i,sum;
               //for(i=0;i<=10;System.out.println("Value="+i),i++);
                     // System.out.println("Value="+i);

               //for(; ; System.out.println("Hello.........."));
                 
                 Scanner sc=new Scanner(System.in);
                 System.out.println("Enter a no:");
                 int n=sc.nextInt();                  
                 //for(i=1,sum=0;i<=n;sum=sum+i,i++);
                 //System.out.println("SUM="+sum);

                  //print series
                  for(i=1,sum=0;i<=n;sum=sum+i,i++){
                           if(i<n)
                              System.out.print(i+"+");
                           else
                              System.out.print(i);
                   }
                  System.out.println("="+sum);




            
                          
   }
}