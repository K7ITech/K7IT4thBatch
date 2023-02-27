
public class company {
	private int company_id;
	String company_name;
	private int company_Salary;

	company(int id, String name, int Salary) {
		this.company_id = company_id;
		this.company_name = company_name;
		this.company_Salary = company_Salary;

}

	public int getCompany_id() {
		return company_id;
	}

	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public int getCompany_Salary() {
		return company_Salary;
	}

	public void setCompany_Salary(int company_Salary) {
		this.company_Salary = company_Salary;
	}

	@Override
	public String toString() {
		return "company [company_id=" + company_id + ", company_name=" + company_name + ", company_Salary="
				+ company_Salary + "]";
	}


}
