package polymorphism;

public class Child extends Parent {
	int a=30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child obj =new Child();
obj.show();
	}
	public void show()
	{
	System.out.println("This is child method");
	}

}
