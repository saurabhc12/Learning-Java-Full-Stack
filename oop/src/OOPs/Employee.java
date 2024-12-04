package OOPs;

//POJO class
public class Employee {
	private int eid;
	private String name;
	private int sal;
	private String dept;
	
	

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Employee(int eid, String name, int sal, String dept) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
		this.dept = dept;
	}
	
	public Employee() {
		super();
	}

}
