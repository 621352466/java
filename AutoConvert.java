public class AutoConvert{
	public static void main(String[] args){
		//自动转换
		//byte char short->int->long->float->double
		int num = 'a';//char->int
		double d1 = 80;//int->double
		System.out.println(num);//97
		System.out.println(d1);//80.0
		
		//detail
		int n1 = 10;//ok
		//float n2 = n1 + 1.1;//wrong n1 + 1.1 =>the type of result is 'double'
		float n2 = n1 + 1.1f;

		//byte char short can not change to each other
		//当把具体数赋值给byte时 先判断是否在byte范围内 如果是就可以
		//byte char short可以计算 计算时首先转换为int类型 不管相同类型还是不同类型

		byte b1 = 2;
		short s1 = 3;
		int b2 = s1 + b1;
        //boolean不参与转换

        //强制类型转换 加一个()
        int n1 = (int)1.9;
        System.out.println("n1 = " + n1);//1

        int n2 = 2000;
        byte b3 = (byte)n2;
        System.out,println(b3);//精度溢出
        //强转符号只对最近的操作数有效 往往会使用小括号体提升优先级
        //int x = (int)10*3.5 + 6*1.5;//wrong  double->int
        int x = (int)(10*3.5 + 6*1.5);//44.0->44
        System.out.println(x);//44
        //char类型可以保存int的常量值 但不能保存int的变量值 需要强转
        char c1 = 10;
        int m = 100;
        //char c2 = m;//wrong

        //练习

        //1.
        short s = 12;//ok
        s = s-9;//wrong int -> short short计算后会变成int
        //2.
        byte b = 10;//ok
        b = b + 11;//wrong int -> short
        b = (byte)(b + 11)//ok 强转
        //3.
        char c = 'a';//ok
        int i = 16;//ok
        float d = .314f;//ok
        double result =c + i +d;//ok
        //4.
        byte b = 16;//ok
        short s = 14;//ok
        short t =s + b;//wrong int->short 





	}
}