package multipleInheritance;


public class Multiplication extends Addition {
	
	
	public void Multiplication() {
		
		int x =a*b;
		
		System.out.println("Multiplied value of " +a+ " and "+b+" is: "+x);
	
	}
	public static void main(String args[])
	{
		Multiplication obj=new Multiplication();
		obj.Add();
		obj.Multiplication();
	}
}