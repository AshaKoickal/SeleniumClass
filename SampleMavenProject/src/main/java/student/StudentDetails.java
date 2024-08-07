package student;

import studentaddress.StudAddress;

public class StudentDetails {
	String name;
	String rollNumber;
	StudAddress studentAdress;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	StudAddress address1=new StudAddress("Address");
StudentDetails obj1=new StudentDetails("Asha","10",address1);
obj1.display();
	}
	
	public StudentDetails(String name, String rollNumber,StudAddress studentAdress)
	{
		this.name=name;
		this.rollNumber=rollNumber;
		this.studentAdress=studentAdress;
	}
	public void display()
	{
	System.out.println("Student details");
	System.out.println(name);
	System.out.println(rollNumber);
	System.out.println(studentAdress.address);
	
	}

}
