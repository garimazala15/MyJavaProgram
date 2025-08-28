import java.util.Scanner;
class FirstN_Even_odd_No{
                     public static void main(String []args){
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter the range:");
                             int n=sc.nextInt();
                             int i;
                             System.out.println("First "+n+" even natural no:");
                             for(i=1;i<=n;i++){
                                   System.out.print(2*i+" ");
                             }
                             System.out.println();
                             System.out.println("First "+n+" odd natural no:");
                             for(i=1;i<=n;i++){
                                   System.out.print(2*i-1+" ");
                             }
                   
                           
     }
}