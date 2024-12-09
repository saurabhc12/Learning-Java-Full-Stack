package String;

public class ReverseWord {
	public static void main(String[] args) {
		
		String str="EduCatioN";
		String str2=str.toLowerCase();
		
		//code to print word reverse 
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();

		
		//code to print Line reverse
        String str3=" java by kiran ";
		for(int i=str3.length()-1;i>=0;i--) {
			if(str3.charAt(i) == ' ' ) {
				for(int j=i+1;j< str3.length() && str3.charAt(j) != ' ';j++) {
					System.out.print(str3.charAt(j));
				
				}System.out.println();
			}
		}
	}
		

	

}
