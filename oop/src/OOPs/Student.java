package OOPs;



//POJO CLASS --> plane old java object
public class Student {
	private int roll;
	private String nm;
	private int marks;
	
	Student(int a,String b, int c){
		roll=a;
		nm=b;
		marks=c;
	}
	
	public boolean setMarks(int new_Marks,int pin) {
		if(pin ==1234) {
			marks=new_Marks;
			return true;
		}else {
			System.out.println("wrong pin");
			return false;
		}
	}
	
	public int get_Marks(int pin) {
		if(pin==1234) {
			return marks;
		}else {
			System.out.println("wrong pin");
			return -1;
		}
	}
	
	public boolean setnm(String new_nm,int pin) {
		if(pin ==1234) {
			nm=new_nm;
			return true;
		}else {
			System.out.println("wrong pin");
			return false;
		}
	}
	
	public String get_nm(int pin) {
		if(pin==1234) {
			return nm;
		}else {
			return "wrong pin";
		}
	}
	
	public boolean setroll(int new_Roll,int pin) {
		if(pin ==1234) {
			roll=new_Roll;
			return true;
		}else {
			System.out.println("wrong pin");
			return false;
		}
	}
	
	public int get_roll(int pin) {
		if(pin==1234) {
			return roll;
		}else {
			System.out.println("wrong pin");
			return -1;
		}
	}

	
	

}
