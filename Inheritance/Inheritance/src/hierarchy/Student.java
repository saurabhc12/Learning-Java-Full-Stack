package hierarchy;

public class Student extends Person {
	int roll;
	String name;
	String city;
	
	//construction chaining
	Student(){
		//super();
		System.out.println("non para");
	}
	Student(int r){
		this();
		this.roll=r;
		System.out.println("1 para");
	}
	Student(int r,String nm){
		this(r);
		this.name=nm;
		System.out.println("2 para");
	}

	Student(String nm,String c){
		super(nm,c);
	}
}
