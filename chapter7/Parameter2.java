public class Parameter2{
	public static void main(String[] args){
    AA a = new AA();
    int arr[] = {1,2,3};
    a.test(arr);
    for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i] + " ");// 200 2 3
		}
    //传递的是地址

		Person p = new Person();
		p.name = "jakc";
		p.age = 10;
		a.test2(p);
		System.out.println(p.age);//2000


	}
}

class AA{
	public void test(int arr[]){
		arr[0] = 200;
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i] + " ");//200 2 3
		}
	}

	public void test2(Person p){
		p.age = 2000;
		System.out.println(p.age);//2000
	}
}

class Person{
	String name;
	int age;
}