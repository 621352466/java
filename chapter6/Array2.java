public class Array2{
	public static void main(String[] args){
    //数组在默认情况下是引用传递，赋的值是地址 赋值方式为引用赋值
    //一个地址 arr2的变化会影响arr1
	// int arr1[] = {1,2,3};
	// int arr2[] = arr1;
	// arr2[0] = 10;
	// System.out.print(arr1[0]);//10

	//如果要求两个数组空间独立
		int arr1[] = {1,2,3};
		int arr2[] = new int[arr1.length];
	//遍历arr1 把每个元素拷贝过去
	for(int i = 0;i < arr1.length;i++){
		arr2[i] = arr1[i];
	}

	arr2[0] = 10;
	for(int i = 0;i < arr1.length;i++){
		System.out.print(arr1[i] + " ");
	}
	for(int i = 0;i < arr2.length;i++){
		System.out.print(arr2[i] + " ");
	}
	}
}