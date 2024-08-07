package aggregassion1;

import aggregassion2.EmployeeAddress;

public class Employee {
	
	String empName,designation;
	int empId;
	static String companyName="ABC";
	EmployeeAddress address;

	public Employee(int empId, String empName,String designation,EmployeeAddress address)
	{
	this.empId=empId;
	this.empName=empName;
	this.designation=designation;
	this.address=address;
	}
public void display()
{
System.out.println("Employee details");
System.out.println(empId);
System.out.println(empName);
System.out.println(empName);
System.out.println(address.houseName);
System.out.println(address.district);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeAddress address1= new EmployeeAddress("Koickal","Kavumbhagom","PathanamThitta",689102);
		Employee emp=new Employee(123,"ASHA","Senior Engineer",address1);
		emp.display();
		

	}

}
