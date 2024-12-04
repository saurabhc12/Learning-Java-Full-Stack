package constructor;

public class Student {
	int roll;
	String name;
	int marks;
	
	Student(){
		System.out.println("Zero parameters");
	}
	Student(int r){
		System.out.println("roll number");
	}
	Student(int r,String nm){
		System.out.println("roll number and name");
	}
	Student(int r,String nm,int marks){
		System.out.println("rool , name , marks");
	}
	
	 
	void m1(){
		System.out.println("io");
		
	}
	void m1(int p) {
		System.out.println("yo");
	}
	void m1(int p, String nm) {
		
	}
    void m1(int p, String nm, int Marks) {
		
	}
    static void m2(){
		System.out.println("zero static");
	}
	static void m2(int p) {
		System.out.println("1 para static");
	}
    
	void marry() {
		System.out.println("girl a");
	}
}


