public class ArithmeticOperator{
	public static void main(String[] args){
		System.out.println(10 / 4);//2.5 -> 2
		System.out.println(10.0 / 4);//2.5
		double d = 10 / 4;//2 -> 2.0
		System.out.println(d);

		//ȡģ ȡ��
		//a % b = a - a/b * b
		//������a�ķ�����ͬ

		//++
		//����ʹ��ʱǰ++�ͺ�++��ȫһ��
		/*
		���ʽʱ
		ǰ++��++i��������ֵ
		��++��i++�ȸ�ֵ������
		*/
		int j = 8;
		int k = ++j;//j = j + 1;k = j;
		System.out.println(k + " " +j);//9 9

		int l = j++;//l = j; j++;



	}
}