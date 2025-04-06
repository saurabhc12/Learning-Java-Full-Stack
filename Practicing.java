import java.util.*;

public class Practicing {

    public static void Primenumber(int a){
        for(int i=2;i<a;i++){
            if(a%i == 0){
                System.out.println("number is not prime");
                return;
            }
        }System.out.println("number is prime");
    }

    public static void ReverseString(String str){
        StringBuilder sb =new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }System.out.println(sb);
    }

    public static void  Palindrom(String str){
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                System.out.println("String is not Palindrom");
                return;
            }
        }System.out.println("string is palindrom");
    }

    public static int factorial(int a){
        if(a==1){
            return a;
        }
        return a*factorial(a-1);
    }

    public static void fibonacci(int n){
        int a=0,b=1,sum;
        System.out.print(a+ " " + b + " ");
        for(int i=2;i<n;i++){
            sum=a+b;
            System.out.print(sum+ " ");
            a=b;
            b=sum;
        }
    }

    public static void fib(int n){
        int a=0,b=1,sum;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<n;i++){
            sum=a+b;
            System.out.print(sum + " ");
            a=b;
            b=sum;
        }
    }

    public static int Largest(int arr[]){
        int large = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(large < arr[i]){
                large=arr[i];
            }
        }return large;
    }

    public static void fibb(int n){
        int a=0,b=1, sum;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<n;i++){
            sum =a+b;
            System.out.print(sum+" ");
            a=b;
            b=sum;
        }
    }

    public static void Accurance(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            int count=1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }
        }System.out.println(sb);
    }

    public static void Anagram(String a,String b){
        char[] arr1 =a.toCharArray();
        char[] arr2 =b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("Strings are anagram");
        }
        else{ 
            System.out.println("Strings are not anagram");
        }
    }

    public static void secondLargest(int arr[]){
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--){
            if(arr[arr.length-1] > arr[i] ){
                System.out.println(arr[i]);
                return;
            }
        }System.err.println("no second largest element");
    }

    public static void GCD(int a, int b){
        int arr1[] = new int[a];
        int arr2[] = new int[b];

        int j=0;
        for(int i=1;i<=a;i++){
            if(a%i == 0){
                arr1[j]=i;
                j++;
            }
        }
        int k=0;
        for(int i=1;i<=b;i++){
            if(b%i == 0){
                arr2[k]=i;
                k++;
            }
        }

        for(int i=j;i>=0;i--){
            for(int j=k;j>=0;j--){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                    return;
                }
            }
        }System.out.println("don't have GCD");
        
    }

    public static void Armstrong(int n){
        int num=n;
        int count=0;
        while(num != 0){
            count++;
            num = num/10;
        }
        int sum=0;
        int actual=n;
        while(n != 0){
            int a=n%10;
            sum= sum + (int)Math.pow(a, count);
            n=n/10;
        }
        if(actual==sum){
            System.out.println("Armstrong");
        }else{System.out.println("not Armstrong");}
    }

    public static void occ(String str){
        for(int i=0;i<str.length();i++){
            int count=1;
            if(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                
            }
        }
    }

    public static void fibbo(int n){
        int a=0,b=1,sum;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<n;i++){
            sum=a+b;
            System.out.print(sum +" ");
            a=b;
            b=sum;
        }
    }

    public static void Occuu(String str){
        StringBuilder sb = new StringBuilder();
        int n=str.length();
        for(int i=0;i<n;i++){
            int count=1;
            while(i<n-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }
        }System.out.println(sb);
    }

    public static void ana(String str1,String str2){
        char[] arr1 =  str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("String is anagram");
        }else{
            System.out.println("not anagram");
        }
    }

    public static void removedup(int arr[]){
        int n=arr.length;
        int temp[] = new int[n];

        Arrays.sort(arr);
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] != arr[i+1]){
                temp[j]=arr[i];
                j++;
            }
        }temp[j]=arr[n-1];
        for(int i=0;i<j;i++){
            System.out.print(temp[i]+ " ");
        }
    }

    public static void divi(){                 //exception handling
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd num");
        int b= sc.nextInt();

        try{
            float result = (float)a / b;
        System.out.println("Output is: " + result);

        // Now safely use throw
        // if (result > 0 && result < 1) { // This will still be false due to integer division
        //     throw new ArithmeticException("a is greater");
        // }
        }
        catch(ArithmeticException e){
            System.out.println(e);                
            System.out.println("Infinity");
        }
        finally{
            System.out.println("if error occure catch wil run otherwise try will run");
        } 
    }
    
    
    public static void main(String[] args) {




        // System.out.println(5/0);

        divi();                                   //exception handling

        // int arr[]={2,4,4,6,2,7,6,6,8,7};
        // removedup(arr);


        // String str1 = "silent";
        // String str2 = "listen";
        // ana(str1, str2);

        // String str="caaapptt";
        // Occuu(str);

        // fibbo(10);
        // Armstrong(153);

        // int a=1445%10;
        // int b=1445/10;
        // System.out.println(a);
        // System.out.println(b);

        // GCD(12, 18);
        // System.out.println(18%12);

        // int arr[]={5,3,7,8,4,2};
        // secondLargest(arr);

        // Anagram("avengers", "marvel");
        // Anagram("listen", "silent");

        // String str = "aabbccdddd";
        // Accurance(str);

        // fibb(10);

        // int arr[]={5,3,7,8,4,2};
        // System.out.println(Largest(arr));

        // fib(10);

        // int n=5;
        // System.out.println(factorial(n));

        // String name ="naman";
        // Palindrom(name);

        // String str = "Iron man";
        // ReverseString(str);

        // System.out.println(Primenumber(12));
        // Primenumber(12);

    }
}
