public class Properties{
	public static void main(String[] args){
    //创建Person对象
    //p1 是对象名（对象引用
	//new Person（） 创建的对象空间（数据） 才是真正的对象
    Person p1 = new Person();
    p1.age = 10;
    p1.name = "1";
    p1.sal = 2.3;
    p1.isPass = true;
    System.out.println("信息");
    System.out.println(p1.age + p1.name + p1.sal + p1.isPass);
	}
}

class Person{
	int age;
	String name;
	double sal;
	boolean isPass;
}
