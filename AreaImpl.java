abstract class TwoDShape{
           abstract void findArea();
           abstract void findPerimeter();
}

class Square extends TwoDShape{

     int s=3;
     void findArea(){
        int area=s*s;
        System.out.println("Area of square is : "+area);
     }

     void findPerimeter(){
      int p=4*s;
      System.out.println("Permitere of square is : " + p);
     }
     
}

class Rectangle extends TwoDShape{

     int l=3,b=5;
     void findArea(){
        int area=l*b;
        System.out.println("Area of Rectangle is : "+area);
     }

     void findPerimeter(){
      int p=2*(l+b);
      System.out.println("Permitere of Retangle is : " + p);
     }
     
}

public class AreaImpl{
    public static void main(String []args){
             Square sq=new Square();
            sq.findArea();
            sq.findPerimeter();

            Rectangle r=new Rectangle();
            r.findArea();
            r.findPerimeter();
            
   }
}