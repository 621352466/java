// import java.util.Scanner;
// public class Test1{
// 	public static void main(String[] args){
// 		Scanner scanner = new Scanner(System.in);
// 		int a = scanner.nextInt();
// 		int b = scanner.nextInt();
// 		scanner.close();
// 	    if(a < b);
// 	    int temp = a;
// 	    a = b;
// 	    b = temp;
// 	    System.out.printf("%d %d %d %d %d",a+b,
// 	    	a-b,a*b,a/b,a%b);
// 	}
// }


// import java.util.Scanner;

// public class Test1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int a = scanner.nextInt();
//         int b = scanner.nextInt();
//         scanner.close();
        
//         if(a<b) a=a+b-(b=a);
//         System.out.printf("%d %d %d %d %d",a+b,a-b,a*b,a/b,a%b);
        

//     }
// }


import java.util.*;
public class Test1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int price = console.nextInt();
        int cost = 0;

        
        cost = (int)(price < 100 ? price : price < 500
        	    ? price*0.9 : price < 2000
        	    ? price*0.8 : price < 5000
        	    ? price*0.7 : price*0.6);
        System.out.println(cost);
    }
}
