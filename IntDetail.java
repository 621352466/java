public class IntDetail{
	public static void main(String[] arg){
		//Ĭ�����double �����float�������f��F
		// float num1 = 1.1; wrong
		float num1 = 1.1f; //right
		double num2 = 1.1; //right
		double num3 = 1.1f; //right
		//��ѧ������ 5.12e2  5.12E-2
		//����������
		double num4 = 2.7;    //2.7
		double num5 = 8.1 / 3 ;//�ӽ�2.7��һ��С�� 2.699999999999999997
		//����������С����������ж�ʱ  Ӧ�����������Ĳ�ֵ�ľ���ֵ��ĳ�����ȷ�Χ���ж�
		if(Math.abs(num4 - num5) < 0.000001){
			System.out.println("equal");
		}
		//unicode
		char n = 97;//a
		System.out.println(n);
		char m = '��';
		System.out.println((int)m);
		char n1 = 'a';//97
		System.out.println('a' + 10);//107

		char a1 = 'b' + 1;//98 + 1 = 99
		System.out.println((int)a1);//99
		System.out.println(a1);//99->��Ӧ���ַ�->ASCII�����

	}
}