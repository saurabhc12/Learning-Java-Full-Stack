package hierarchy;

public class Calculator {
	int addTwo(int a,int b) {
	return a+b;
	}
	
	int average(int a , int b) {
		System.out.println(this);
		int sum=this.addTwo(a,b);
		return sum;
	}

}


	

