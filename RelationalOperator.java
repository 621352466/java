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

		// ||  if the first condition is ture,then output ture
		// |   whatever the first condition is,two conditions will be judged 
		int num = 50;
        if(num > 20 || num < 30){
        	System.out.println("ok1");
        }
        
        if(num > 20 | num < 30){
        	System.out.println("ok2");
        }
        int s1 = 4;
		int s2 = 9;
		if(s1 < 1 || ++s2 < 50){
			System.out.println("ok300");
		}
		System.out.println( n1 + " "+n2);//4 9
		if(s1 < 1 | ++s2 < 50){
			System.out.println("ok400");
		}
		System.out.println(s1 + " " +s2);//4 10


        //InverseOperater
		// !  Ture -> False
		System.out.println(60 > 20);  //T
		System.out.println(!(60 > 20)); //F

		//a^b  if a and b are different,output Ture otherwise output False
		boolean b1 = (10 > 1) ^ (3 < 5);
		System.out.println(b1);//F


	}
}