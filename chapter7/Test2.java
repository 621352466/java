public class Test2{
	public static void main(String[] args){
		A a = new A();
		a.sayOk();
		a.m1();

	}
}
class A{
	//同一个类的方法可以直接调用
	public void print(int n){
		System.out.println(n);
	}
	public void sayOk(){
		print(10);//
		System.out.println("sayok");
	}

	//跨类方法调用需要通过对象名
	public void m1(){
		System.out.println("m1被调用");
		B b = new B();
		b.hi();
		System.out.println("m1继续调用");

	}
}

class B{
	public void hi(){
		System.out.println("hi");
	}
}