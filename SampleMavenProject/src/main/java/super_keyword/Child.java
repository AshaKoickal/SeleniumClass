package super_keyword;

public class Child extends Parent{

	int a=30;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Child obj=new Child();
		obj.show();
		System.out.println(obj.a);

	}
	public Child()
	{
		super(40);
		System.out.println("Child Constructor");
	}
	public void show()
	{
		//System.out.println("Child method");
		//System.out.println(super.a);
		//super.show();
	}

}
