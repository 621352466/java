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

		//��̬�ĸ��������Ԫ��Ч��  ʵ������
	// 	Scanner myScanner = new Scanner(System.in);
	// 	do{
	// 	int arr1[] = {1,2,3};
	//     int arr2[] = new int[arr1.length + 1];
	//     for(int i = 0;i < arr1.length;i++){
	//     	arr2[i] = arr1[i];

	//     }
	//     System.out.println("��������ӵ�Ԫ��");
	//     int add = myScanner.nextInt();
	//     arr2[arr2.length - 1] = add;
	//     arr1 = arr2;
	//     for(int i = 0;i < arr1.length;i++){
	// 			System.out.print(arr1[i] + " ");
	// 	}
	// 	System.out.println("�Ƿ������� T/F");
	// 	char key = myScanner.next() .charAt(0);
	// 	if(key == 'F'){
	// 		break;
	// 	}
	// }while(true);
	// System.out.println("��ӽ���");

	//��̬���� 
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
	System.out.println("�Ƿ�Ҫ�������� T/F");
	char key = myScanner.next().charAt(0);	
	if(key == 'F' ){
		
		break;
	}else if(arr1.length <= 1){
		System.out.println("����������");
		break;
	}
}while(true);



	}
}