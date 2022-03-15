import java.util.Scanner;
public class ArrayAdd{
	public static void main(String[] args){
 //    int arr1[] = {1,2,3};
 //    int arr2[] = new int[arr1.length + 1];
 //    for(int i = 0;i < arr1.length;i++){
 //    	arr2[i] = arr1[i];

 //    }
 //    arr2[arr2.length - 1] = 4;
 //    arr1 = arr2;
 //    for(int i = 0;i < arr1.length;i++){
	// 		System.out.print(arr1[i] + " ");
	// 	}

		//动态的给数组添加元素效果  实现扩容
	// 	Scanner myScanner = new Scanner(System.in);
	// 	do{
	// 	int arr1[] = {1,2,3};
	//     int arr2[] = new int[arr1.length + 1];
	//     for(int i = 0;i < arr1.length;i++){
	//     	arr2[i] = arr1[i];

	//     }
	//     System.out.println("请输入添加的元素");
	//     int add = myScanner.nextInt();
	//     arr2[arr2.length - 1] = add;
	//     arr1 = arr2;
	//     for(int i = 0;i < arr1.length;i++){
	// 			System.out.print(arr1[i] + " ");
	// 	}
	// 	System.out.println("是否继续添加 T/F");
	// 	char key = myScanner.next() .charAt(0);
	// 	if(key == 'F'){
	// 		break;
	// 	}
	// }while(true);
	// System.out.println("添加结束");

	//动态缩减 
	int arr1[] = {1,2,3,4,5};
	Scanner myScanner = new Scanner(System.in);
	do{

	int arr2[] = new int[arr1.length - 1];
	for(int i = 0;i < arr2.length;i++){
		arr2[i] = arr1[i];

	}
	arr1 = arr2;
	for(int i =0;i < arr2.length;i++){
		System.out.print(arr1[i] + " " );
	}
	System.out.println("是否要继续缩减 T/F");
	char key = myScanner.next().charAt(0);	
	if(key == 'F' ){
		
		break;
	}else if(arr1.length <= 1){
		System.out.println("不能再缩减");
		break;
	}
}while(true);



	}
}