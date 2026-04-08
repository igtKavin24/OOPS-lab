class Calculator{
	public int add(int a, int b){
		return a+b;
	}
	protected void display(){
		System.out.println("You can add using the add() method");
	}
	private void show(){
		System.out.println("This is a private method");
	}
	public void accessPrivate(){
		show();
	}
}

class AdvancedCalculator extends Calculator{
	@Override 
	public int add(int a, int b){
		return a-b;
	}
	@Override
	protected void display(){
		System.out.println("You can subtract using the add() method");
	}
}

public class Calc{
	public static void main(String[] args){
		Calculator c = new Calculator();
		AdvancedCalculator ac = new AdvancedCalculator();

		c.add(5,3);
		ac.add(5,3);

		c.display();
		ac.display();

		c.accessPrivate();
		ac.accessPrivate();
	}
}