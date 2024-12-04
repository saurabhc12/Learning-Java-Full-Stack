package tka;

public class logic {
	
	void armstrong(int num) {
		int temp=num;
		int count=0;
		int sum=0;
		
		while(temp>0) {
			count++;
			temp=temp/10;
		}
		temp=num;
		while(temp>0) {
			int digit=temp%10;
			sum+=Math.pow(digit, count);
			temp=temp/10;
		}
		
		if(sum==num) {
			System.out.println("armstorng");
		}else {
			System.out.println("not armstrong");
		}
	}
	
	void reverse(int n) {
		int rev=0;
		
		while(n>0) {
			int digit=n%10;
			rev = rev*10+digit;
			n=n/10;
		}
		System.out.println(rev);
	}
	
	void prime(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if (count==2) {
			System.out.println("number is prime");
		}
		else {
			System.out.println("number is not prime");
		}
	}
	
	void primeboolean(int n) {
		boolean isprime=true;
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				isprime=false;
				break;
			}
		}if(isprime && n!=1) {
			System.out.println("number is prime");
		}else {
			System.out.println("number is not prime");
		}
	}
	
	void table(int n) {
		
		int k=0;
		for(int i=1;i<=10;i++) {
			k=k+n;
			System.out.println(n + "*" + i + "=" + k);			
		}
	}

  boolean checkleap(int y) {
	  int year = y;
		 if(year%4==0 && (year%100!=0 || year%400==0)) {
			// System.out.println("year is leap year");
			 return true;
		 }else {
			// System.out.println("year is not leap");
			 return false;
		 }
  }
	int checkmax(int a, int b, int c) {
		if(a>b && a>c) {
			//System.out.println("a is greater"+a);
			return a;
		}else if(b>a && b>c) {
			//System.out.println("b is greater"+b);
			return b;
		}else {
			//System.out.print("c is greater"+c);
			return c;
		}
		//return 0;
	}
	
	boolean evenodd(int a) {
		if(a%2==0) {
			return true;
		}else {
			return false;
		}
	}
  
}
