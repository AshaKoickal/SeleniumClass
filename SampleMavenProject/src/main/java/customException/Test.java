package customException;

public class Test {

	public static void main(String[] args) throws LicenceException {
		// TODO Auto-generated method stub
Test obj=new Test();
try
{
obj.check(10);
}
catch(LicenceException ex)
{
ex.printStackTrace();
}
System.out.println("End of execution");
	}
	public void check(int age) throws LicenceException
	{
		if(age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			//throw new IOException();
			throw new LicenceException("Not eligible for voting");
		}
	}

}
