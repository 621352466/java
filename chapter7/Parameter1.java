public class Parameter1{
	public static void main(String[] args){
		int a =10;
		int b =20;
		A c = new A();
		c.swap(a,b);//20 10

		System.out.println(a +"\t"+ b);// 10 20

	}
}

class A{
	public void swap(int a,int b){
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a+"\t"+b);

	}
}