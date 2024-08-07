package exception;

public class SampleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SampleException sample=new SampleException();

sample.display();

System.out.println("end of excecution");

	}
	
	public void display()
	{
		int a =10;
		//arithmetic exception
		try
		{
		int b=a/0;
		System.out.println(b);
		}
		/*catch(Exception e)
		{
			//System.out.println(e);
			e.printStackTrace();
		}*/
		finally
		{
			System.out.println("Finally block is executed");
		}
		//arrayindexoutofbound and null pointer
	}

}
