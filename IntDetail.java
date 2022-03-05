public class IntDetail{
	public static void main(String[] arg){
		//默认输出double 想输出float后面须加f或F
		// float num1 = 1.1; wrong
		float num1 = 1.1f; //right
		double num2 = 1.1; //right
		double num3 = 1.1f; //right
		//科学计数法 5.12e2  5.12E-2
		//浮点数陷阱
		double num4 = 2.7;    //2.7
		double num5 = 8.1 / 3 ;//接近2.7的一个小数 2.699999999999999997
		//对运算过后的小数进行相等判断时  应该以两个数的差值的绝对值在某个精度范围内判断
		if(Math.abs(num4 - num5) < 0.000001){
			System.out.println("equal");
		}
		//unicode
		char n = 97;//a
		System.out.println(n);
		char m = '王';
		System.out.println((int)m);
		char n1 = 'a';//97
		System.out.println('a' + 10);//107

		char a1 = 'b' + 1;//98 + 1 = 99
		System.out.println((int)a1);//99
		System.out.println(a1);//99->对应的字符->ASCII编码表

	}
}