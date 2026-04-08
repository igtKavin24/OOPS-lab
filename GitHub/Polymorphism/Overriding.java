class Animals{
   void sound(){
	System.out.println("Generally animals make sound!!");
   }
}
class Dog extends Animals{
   void sound(){
	super.sound();
	System.out.println("Dog barks!!");
   }
}
public class Overriding{
   public static void main(String[] args){
	Animals a=new Animals();
	Dog d=new Dog();
	Animals a2=new Dog();
	a.sound();
	d.sound();
	a2.sound();
   }
}