package constructor;

public class Test {
	
	public static void main(String args[]) {
		Student s1 = new Student();
		Student s2 = new Student(2);
		Student s3 = new Student(3,"name");
		Student s4 = new Student(4,"name2",55);
//		
		s1.m2(5);
		s1.marry();
		
		Room c1 = new Room();
		c1.marry();
//
	} 

}
