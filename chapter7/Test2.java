public class Test2{
	public static void main(String[] args){
		A a = new A();
		a.sayOk();
		a.m1();

	}
}
class A{
	//ͬһ����ķ�������ֱ�ӵ���
	public void print(int n){
		System.out.println(n);
	}
	public void sayOk(){
		print(10);//
		System.out.println("sayok");
	}

	//���෽��������Ҫͨ��������
	public void m1(){
		System.out.println("m1������");
		B b = new B();
		b.hi();
		System.out.println("m1��������");

	}
}

class B{
	public void hi(){
		System.out.println("hi");
	}
}