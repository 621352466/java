public class Exercise2{
	public static void main(String[] args){
		// MyTools a = new MyTools();
		// int arr1[][] = {{1,2,3},{4,5,6}};
		// a.print(arr1);

		Person p = new Person();
		p.name = "tom";
		p.age = 10;
		MyTools tools = new MyTools();
		Person p2 = tools.copyPerson(p);
		//p��p2�����������Ķ��� ������ͬ
		System.out.println(p.name + " " + p.age);
		System.out.println(p2.name + " " + p2.age);

	}
}

class Person{
	String name;
	int age;
}
class MyTools{
	// public void print(int arr[][]){
	// 	for(int i = 0;i < arr.length;i++){
	// 		for(int j = 0;j < arr[i].length;j++){
	// 			System.out.print(arr[i][j] + " ");
	// 		}
	// 		System.out.println();
	// 	}
	// }

	public Person copyPerson(Person p){
		//����һ���¶���
		Person p2 = new Person();
		p2.name = p.name;
		p2.age = p.age;
		return p2;

	}
}

