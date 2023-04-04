
public class Student
{
	private int stdid;
	private String stdname;
	private int stdage;
	private String instname;
	
	Student(int stdid,String stdname,int stdage,String instname)
	{
		this.stdid = stdid;
		this.stdname = stdname;
		this.stdage = stdage;
		this.instname = instname;
	}
	public int getStdid()
	{
		return stdid;
		
	}
	public void setStdid(int stdid)
	{
		this.stdid = stdid;
		
	}
	public String getStdname()
	{
		return stdname;
		
	}
	public void setStdname(String stdname)
	{
		this.stdname = stdname;
	}
	public int getStdage()
	{
		return stdage;
		
	}
	public void setSalary(int stdage)
	{
		this.stdage = stdage;
	}
	public String getInstname(String instname)
	{
		return instname;
		
	}
	public void setCompanyname(String instname)
	{
		this.instname =instname;
	}
	
public String toString()
{
	return "student[stdid="+stdid+",stdname="+stdname+",stdage="+stdage+",instname="+instname+"]";
}
	

}
