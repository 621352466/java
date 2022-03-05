public class ArithmeticOperator{
	public static void main(String[] args){
		System.out.println(10 / 4);//2.5 -> 2
		System.out.println(10.0 / 4);//2.5
		double d = 10 / 4;//2 -> 2.0
		System.out.println(d);

		//取模 取余
		//a % b = a - a/b * b
		//余数与a的符号相同

		//++
		//独立使用时前++和后++完全一致
		/*
		表达式时
		前++：++i先自增后赋值
		后++：i++先赋值后自增
		*/
		int j = 8;
		int k = ++j;//j = j + 1;k = j;
		System.out.println(k + " " +j);//9 9

		int l = j++;//l = j; j++;



	}
}