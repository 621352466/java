public class Method1{
	public static void main(String[] args){
		//方法使用
		Person p = new Person();
		p.speak();
		p.cal();
		p.cal1(6);
		
		int returnsum = p.getSum(1,2);
		System.out.println(returnsum);
    
	}
}

class Person{
	String name;
	int age;
	//成员方法
	//添加speak 成员方法 输出“我是一个好人”
	public void speak(){
		System.out.println("我是一个好人");
	}

	//添加cal 成员方法 计算1+...1000结果
	public void cal(){
    int sum = 0;
    for(int i = 0;i <= 1000;i++){
    sum += i;
    }
    System.out.println(sum);

	}
    
    //接受n 输出1+....n
	public void cal1(int n){
	int sum = 0;
    for(int i = 0;i <= n;i++){
    sum += i;
    }
    System.out.println(sum);

	}


	//接受两个数 输出两个数的和
	public int getSum(int num1, int num2){
		int sum = num1 + num2;
		return sum;

	}
}