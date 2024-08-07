package multipleInheritance;

public class Subtraction extends Addition  {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Subtraction obj=new Subtraction();
obj.Add();
obj.Subtract();
	}
	public void Subtract()
	{
		int sub=a-b;
		System.out.println("Subtracted value of " +a+ " and "+b+" is: "+sub);
		}
	
	}


