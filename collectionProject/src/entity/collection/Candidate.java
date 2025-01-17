package entity.collection;

public class Candidate {
	
	private String name;
	private String assembly;
	private String partyname;
	private int age;
	private String gender;
	
	public Candidate() {
		super();
	}

	public Candidate(String name, String assembly, String partyname, int age, String gender) {
		super();
		this.name = name;
		this.assembly = assembly;
		this.partyname = partyname;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAssembly() {
		return assembly;
	}

	public void setAssembly(String assembly) {
		this.assembly = assembly;
	}

	public String getPartyname() {
		return partyname;
	}

	public void setPartyname(String partyname) {
		this.partyname = partyname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Candidate [name=" + name + ", assembly=" + assembly + ", age=" + age + "]";
	}
	
	

}
