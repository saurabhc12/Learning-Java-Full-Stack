package hibernatesStudentProject;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student{
	
	@Id
	@Column(name="s_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roll;
	private String name;
	private int marks;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Address_Id", referencedColumnName="id")
	private Address address;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Orders> order = new ArrayList<Orders>();
	
	public Student() {
		super();
	}
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	public Student(String name, int marks, Address address, List<Orders> order) {
		super();
		this.name = name;
		this.marks = marks;
		this.address = address;
		this.order = order;
	}
	
	public List<Orders> getOrder() {
		return order;
	}
	public void setOrder(List<Orders> order) {
		this.order = order;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ",name=" + name + "]";
	}
	
}