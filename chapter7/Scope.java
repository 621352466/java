public class Scope{
	public static void main(String[] args){
    AA a = new AA();
    a.b();
    //ȫ�ֱ������Կ���
    //��һ���÷� ͨ���������
    BB a1 = new BB();
    a1.test();//10
    //�ڶ����÷� ����ͨ����������
    a1.test2(a);

	}
}

class BB{
	public void test(){
    AA b = new AA();
    System.out.println(b.age);
	}

	public void test2(AA a){
		System.out.println(a.age);

	}
}

class AA{
	//ȫ�ֱ��� Ҳ�������� ������Ϊ�������� AA��
	//ȫ�ֱ��� ���Բ���ֵ Ĭ��ֵ��0.0
	//���Ժ;ֲ������������� ����ʱ��ѭ�ͽ�ԭ��
	//��ͬһ���������� �ֲ�������������
	//���԰�����󴴽������� ����������ٶ�����
	//�ֲ��������������ִ�ж����� �����������������
	
	//������Χ
	//ȫ�ֱ������Ա������ʹ�� �ֲ�����ֻ�ܱ����Ӧ�ķ���ʹ��
	
	//ȫ�ֱ������Լ����η� �ֲ���������
	int age = 10;
	public void a(){
		//n �� name��������a������
		int n = 10;
		String name = "tom";
	}

	public void b(){
		System.out.println(age);
	}
}