import java.util.Scanner;
public class Array1{
	public static void main(String[] args){
		//��ĸ��ƽ������
		// double total = 0;
		// double hens[] = {3,5,1,3.4,2,50};
		// for(int i = 0;i < 6;i++){
		// 	System.out.println("��"+ (i+1) +"��Ԫ��"+hens[i]);
  //           total += hens[i];
		// }
		// System.out.println(total);
		// System.out.println(hens.length);

        //
		// double scores[] = new double[5];
		// Scanner myScanner = new Scanner(System.in);
		// for(int i = 0;i < scores.length;i++){
		// 	System.out.println(i+1);
		// 	scores[i] = myScanner.nextDouble();
		// }
		// for(int i = 0;i < scores.length;i++){
		// 	System.out.println(scores[i]);
		// }

		//��ά����
		//arr[i].length�õ���Ӧ��һά����ĳ���
		int arr[][] = {{1,3,5,6},{7,8,9,2}};
		for(int i = 0;i < arr.length;i++){
			for(int j = 0;j < arr[i].length;j++){
				System.out.print(arr[i][j] + " ");
			}
		}
		System.out.println(arr[1][3]);//2 4

	}
}