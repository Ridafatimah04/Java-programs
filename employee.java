package week2;
class Employee
{
	String empName;
	int empNo;
	float salary;
	String empDesig;
	byte expYrs;
	
	void setEmployee(String name,int no,float sal,String desig,byte yrs)
	{
		empName=name;empNo=no;salary=sal;empDesig=desig;expYrs=yrs;
	}
	void getEmployee()
	{
		System.out.println(empName+"\t"+empNo+"\t"+empDesig+"\t"+salary+"\t"+expYrs+"\n");
	}
}
class demoEmployee{
	public static void main(String args[])
	{
		Employee rahul=new Employee();
		rahul.setEmployee("rahul", 128966, 99999.0f,"PM",(byte)20);
		System.out.println("empName \t empNo \t empDesig \t salary \t expYrs \n");
		rahul.getEmployee();
		Employee ramya=new Employee();
		ramya.setEmployee("ramya", 7854412, 894576.0f,"Project Leader",(byte)10);
		ramya.getEmployee();
	}
}



