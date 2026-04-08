class Parent{
   void printDetails(String name){
	System.out.println("Name:"+name);
   }
   void printDetails(String name,int age){
	System.out.println("Name:"+name);
	System.out.println("Age:"+age);
   }
   void printDetails(String name,int age,String city){
	System.out.println("Name:"+name);
	System.out.println("Age:"+age);
	System.out.println("City:"+city);
   }
}
public class Overloading{
   public static void main(String[] args){
	Parent p=new Parent();
	p.printDetails("Kavin");
	p.printDetails("Kavin",18);
	p.printDetails("Kavin",18,"Chennai");
   }
}