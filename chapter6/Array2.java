public class Array2{
	public static void main(String[] args){
    //������Ĭ������������ô��ݣ�����ֵ�ǵ�ַ ��ֵ��ʽΪ���ø�ֵ
    //һ����ַ arr2�ı仯��Ӱ��arr1
	// int arr1[] = {1,2,3};
	// int arr2[] = arr1;
	// arr2[0] = 10;
	// System.out.print(arr1[0]);//10

	//���Ҫ����������ռ����
		int arr1[] = {1,2,3};
		int arr2[] = new int[arr1.length];
	//����arr1 ��ÿ��Ԫ�ؿ�����ȥ
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