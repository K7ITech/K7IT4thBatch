
public class Employee {
	private int empid;
	private String empname;
	private int salary;
	private String companyname;
	
	
	Employee(int empid,String empname,int salary,String companyname ){
	
	this.empid = empid;
	this.empname = empname;
	this.salary = salary;
	this.companyname = companyname; 
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmname() {
		return empname;
	}

	public void setEmname(String emname) {
		this.empname = emname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", companyname=" + companyname
				+ "]";
	}
}




