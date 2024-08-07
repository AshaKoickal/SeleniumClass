package encapsulation;



public class Sample {

	private int age;
	private String name;
	
	public void setter(int age, String name)
	{
		this.age=age;
		this.name=name;
		//age=age*2;
	}
	public void getter()
	{
		System.out.println(age);
		System.out.println(name);
	}
}
