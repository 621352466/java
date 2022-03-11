import java.util.Scanner;
public class Stars{
	public static void main(String[] args){
		//圣诞树
		//    *
		//   ***
		//  ***** 
		//    *
		// Scanner myScanner = new Scanner(System.in);
		// int n  = myScanner.nextInt();
		// for(int i = 1;i <= n ;i++){
		// 	for(int k = 1;k <= n - i;k++){
		// 		System.out.print(" ");
		// 	}
		// 	for(int j = 1;j <= 2*i - 1;j++){
		// 		System.out.print("*");
		// 	}
		// 	System.out.print ("\n");
		// }
		// for(int l = 1;l <= n-2;l++){
		// 	for(int o = 0;o < n - 1;o++) {          
  //           	System.out.print(" ") ;        
  //           }
  //           System.out.println("*");
		
		//空心三角形
		//     *
		//    * *
		//   *   *
		//  * * * *
		Scanner myScanner = new Scanner(System.in);
		 int n  = myScanner.nextInt();
		 for(int i = 1;i <= n;i++){
		 	for(int j = 1;j <= n -i;j++ ){
		 		System.out.print(" ");
		 	}
		 	for(int k = 1;k <= 2*i -1;k++){
		 		if(i == 1 || i == n){          //此处一定要用== 因为if里用的是boolean类型
		 			System.out.print("*");     //  int 无法转boolean
		 		}else if(k == 1 || k == 2*i -1){
		 			System.out.print("*");
		 		}else{
		 			System.out.print(" ");
		 		}
		 		
		 	}
		 	System.out.println();
		 }
	}
}