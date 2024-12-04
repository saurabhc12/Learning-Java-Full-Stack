package test;

public class Student {
	
	int age;
	String nm;
	int marks;
	String city;
	
Student(int a,String b,int c){
		
		System.out.println("object initialization...");
		age=a;
		nm=b;
		marks=c;
		
		System.out.println("Student name is "+nm);
		System.out.println("student age is "+age);
		System.out.println("student marks is "+marks);
		System.out.println();
	}
	
	Student(int a, String b){
		age=a;
		nm=b;
		
		System.out.println("object initialization...");
		System.out.println("Student name is "+nm);
		System.out.println("student age is "+age);
		System.out.println();
	}
	
	Student(int a){
		age=a;
		
		System.out.println("object initialization...");
		System.out.println("student age is "+age);
		System.out.println();
	}
	
	
	Student(){
		System.out.println("non Para contructor");
	}
	
	
	void detail() {
		System.out.println("Student name is "+nm);
		System.out.println("student age is "+age);
		System.out.println("student marks is "+marks);
	}

	
	Student(Student s1){
		age =s1.age;
		nm=s1.nm;
		marks=s1.marks;
		
		System.out.println("Student name is "+nm);
		System.out.println("student age is "+age);
		System.out.println("student marks is "+marks);
		System.out.println();
	}
	
//     Student(Person p1){
//    	 age =p1.age;
//    	 nm=p1.name;
//    	 city=p1.city;
//    	 System.out.println("Student name is "+nm);
// 		System.out.println("student age is "+age);
// 		System.out.println("student city is "+city);
// 		System.out.println();
//    	 
//     }
}
