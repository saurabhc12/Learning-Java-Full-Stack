package Exception;

public class Test {
	
	public static void main(String[] args) {
		System.out.println(4/6);
		System.out.println(8/3);
		try {
		System.out.println(5/0);}
		catch(ArithmeticException e) {	
			System.out.println(e);
			System.out.println("infinity");}

		// 1. try - catch
		// 2. try - catch - finally
		// 3. try - finally
		
		System.out.println(9/2);
		System.out.println(6/5);
	}

}
