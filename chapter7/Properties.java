public class Properties{
	public static void main(String[] args){
    //����Person����
    //p1 �Ƕ���������������
	//new Person���� �����Ķ���ռ䣨���ݣ� ���������Ķ���
    Person p1 = new Person();
    p1.age = 10;
    p1.name = "1";
    p1.sal = 2.3;
    p1.isPass = true;
    System.out.println("��Ϣ");
    System.out.println(p1.age + p1.name + p1.sal + p1.isPass);
	}
}

class Person{
	int age;
	String name;
	double sal;
	boolean isPass;
}
