class Calculator{
	public int add(int a, int b){
		return a+b;
	}
	protected int add(int a, int b, int c){
		return a+b+c;
	}
	private double add(double a, double b){
		return a+b;
	}
	public double getAdd(double a, double b){
		return add(a,b);
	}
}

public class Calc2 {
	public static void main(String[] args){
		Calculator c = new Calculator();
		System.out.println(c.add(2,3));
		System.out.println(c.add(2,3,5));
		System.out.println(c.getAdd(2.5,6.3));
	}
}