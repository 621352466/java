public class ArrayReverse{
	public static void main(String[] args){
    //数组反转
		int arr1[] = {1,2,3,4,5,6};
		int temp = 0;
		for(int i = 0;i < arr1.length/2;i++){
			temp = arr1[i];
			arr1[i] = arr1[arr1.length -1 - i];
			arr1[arr1.length -1 - i] = temp;
			
		}
		for(int i = 0;i < arr1.length;i++){
			System.out.print(arr1[i] + " ");
		}
	}
}