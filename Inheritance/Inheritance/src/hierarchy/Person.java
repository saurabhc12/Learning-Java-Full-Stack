package hierarchy;

public class Person {
// void marry() {
//	 System.out.println("girl a");
// }
	
	String name;
	String city;
	
	Person(){
		System.out.println("o para");
	}
	
	Person(String nm){
		this.name=nm;
		System.out.println("1 par a parent class constructor");
		
	}
	
	Person(String nm,String c){
		this(nm);
		this.city=c;
		System.out.println("2 para parent  class");
	}
}
