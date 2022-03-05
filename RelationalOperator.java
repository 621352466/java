public class RelationalOperator{
	public static void main(String[] args){
		//thr result of relationloperate is a Boolean
		int a = 9;
		int b = 8;
		System.out.println(a > b);//T
		System.out.println(a >= b);//T
		System.out.println(a < b);//F
		System.out.println(a <= b);//F
		System.out.println(a == b);//F
		System.out.println(a != b);//T
		boolean flag = a>b;
		System.out.println("flag");//T

		//logicoperator
		//&& and &
		//&&   if the first condition is false,then output false
		//&    whatever the first conditionis,two conditions will be judged 
		int age = 50;
		if(age > 20 && age < 90){
			System.out.println("ok100");
		}
		if(age > 20 & age < 90){
			System.out.println("ok200");
		}
		//difference
		int n1 = 4;
		int n2 = 9;
		if(n1 < 1 && ++n2 < 50){
			System.out.println("ok300");
		}
		System.out.println( n1 + " "+n2);//4 9
		if(n1 < 1 & ++n2 < 50){
			System.out.println("ok400");
		}
		System.out.println(n1 + " " +n2);//4 10
	}
}