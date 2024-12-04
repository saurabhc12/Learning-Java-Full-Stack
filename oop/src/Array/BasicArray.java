package Array;

public class BasicArray {
	
	public static void main(String args[]) {
	int arr[]= {4,3,2,1,5,6,7,9,8};
	int max=0;
	int min=arr[0];
	//int evencount=0;
	//int oddcount=0;
	int evenSum=0;
	int oddSum=0;
	
	for(int i=0;i<arr.length;i++) {
		if(max<arr[i]) {
			max=arr[i];
		}
	}
	System.out.println("largest ="+max);
	
	for(int i=0;i<arr.length;i++) {
		if(min>arr[i]) {
			min=arr[i];
		}
	}
	System.out.println("smallest ="+min);
	
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			System.out.print("["+arr[i]+"]");
			evenSum = evenSum+arr[i];
		}
	}
	System.out.println();
	System.out.println("Sum of even ="+evenSum);
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2!=0) {
			System.out.print("["+arr[i]+"]");
			oddSum = oddSum+arr[i];
		}
	}
	System.out.println();
	System.out.println("Sum of even ="+oddSum);
	
	//int ayy[]=new int[arr.length];
	int temp=0;
	for(int i=0;i<arr.length-1;i++) {
		for(int j=i;j<arr.length;j++) {
			
			if(arr[i+1]<arr[i]) {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
	}
	for(int i=0;i<arr.length;i++) {
	System.out.print("["+arr[i]+"]");
	}

}
}
