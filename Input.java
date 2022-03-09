import java.util.Scanner;//表示把java.util下的Scanner类导入
public class Input{
	public static void main(String[] args){
	//Scanner类表示 简单文本扫描器 在java.util包
	//1、引入Scanner类所在的包
	//2、创建Scanner对象，new创建一个对象

	Scanner myScanner = new Scanner(System.in);
	//3.接受用户输入
	//当程序执行到next方法时会等待用户输入
	System.out.println("name");
	String name = myScanner.next();//接受用户输入
	System.out.println("age");
	int age = myScanner.nextInt();//接受用户输入
	System.out.println("salary");
	double salary = myScanner.nextDouble();//接受用户输入
	System.out.println("信息如下");
	System.out.println("名字 = " + name +
		"年龄 = " + age + "薪水 = " +salary);

	// import java.util.Scanner;
	// Scanner myScanner = new Scanner(System.in);
	// int age = myScanner.nextInt;


	}
}