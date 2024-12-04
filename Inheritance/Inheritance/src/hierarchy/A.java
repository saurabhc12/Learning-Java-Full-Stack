package hierarchy;

public class A extends B {
	
		int p;
		int z=90;
		A(){
			
		}
		A(int b){
			this.p=b;
		}
		void m1() {
			super.m1();
			int z=30;
			System.out.println(z);
			System.out.println(this.z);
			System.out.println(super.z);
			//System.out.println(p);
		}
}
