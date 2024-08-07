package abstraction;

public class Child extends Sample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child obj =new Child();
obj.show();
obj.display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method");
	}

}
