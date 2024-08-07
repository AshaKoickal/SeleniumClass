package interface_example;

public class Sample implements Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Sample obj=new Sample();
obj.show();
obj.display();
obj.instanceMethod();*/
		Test obj1=new Sample();
		obj1.display();
		obj1.instanceMethod();
	}

	public void show()
	{
		System.out.println("Method of class Sample");
	}
	@Override
	public void display() {
		
		System.out.println("First method of Interface test");
		
	}

	@Override
	public void instanceMethod() {
		
		System.out.println("Second method of interface Test");
		
	}

}
