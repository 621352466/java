public class Scope{
	public static void main(String[] args){
    AA a = new AA();
    a.b();
    //全局变量可以跨类
    //第一种用法 通过对象调用
    BB a1 = new BB();
    a1.test();//10
    //第二种用法 可以通过方法传递
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
	//全局变量 也就是属性 作用域为整个类体 AA类
	//全局变量 可以不赋值 默认值是0.0
	//属性和局部变量可以重名 访问时遵循就近原则
	//在同一个作用域中 局部变量不能重名
	//属性伴随对象创建而创建 伴随对象销毁而销毁
	//局部变量伴随代码块的执行而创建 伴随代码块结束而销毁
	
	//作用域范围
	//全局变量可以被别的类使用 局部变量只能本类对应的方法使用
	
	//全局变量可以加修饰符 局部变量不行
	int age = 10;
	public void a(){
		//n 和 name作用域在a方法中
		int n = 10;
		String name = "tom";
	}

	public void b(){
		System.out.println(age);
	}
}