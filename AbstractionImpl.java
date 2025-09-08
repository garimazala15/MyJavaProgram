abstract class Animal{
         String name;
         public Animal(){}
         public Animal(String name){
                this.name=name;
         }
         void show(){
              System.out.println("I am "+name);
         }

        abstract void saySomething();
}

class Dog extends Animal{
            void eat(){
                  System.out.println("Eats bisciuts");
            }   

            void saySomething(){
                       System.out.println("Bho Bho.......");
            }

}

class Cat extends Animal{
            void eat(){
                 System.out.println("Drink milk");
             }  
             void saySomething(){
                        System.out.println("Meow Meow..........");
             }

}

public class AbstractionImpl{
            public static void main(String []args){
                       Dog d=new Dog();
                       d.name="boxer";
                       d.show();
                       d.saySomething();

                       Cat c=new Cat();
                       c.name="frutie";
                       c.show();
                       c.saySomething();
    }
}