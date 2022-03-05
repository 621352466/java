public class StringToBasic{
	public static void main(String[] args){

		//基本数据类型 -> String

		int n1 = 100;
		float f1 = 1.1f;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = n1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";
        System.out.println(s1 + " " + s2 + " " + s3 +" " + s4 + " " );	

        //String -> Basic
        //解读使用基本数据类型对应的包装类的相应方法得到基本数据类型
        String s5 = "123";
        int num1 = Integer.parseInt(s5);
        double num2 = Double.parseDouble(s5);
        float num3 = Float.parseFloat(s5);
        long num4 = Long.parseLong(s5);
        byte num5 = Byte.parseByte(s5);
        boolean b = Boolean.parseBoolean("true");
        short num6 = Short.parseShort(s5);
        //转后从字符串变成数字
        System.out.println(num1);//123
        System.out.println(num2);//123.0
        System.out.println(num3);//123.0
        System.out.println(num4);//123
        System.out.println(num5);//123
        System.out.println(num6);//123
        System.out.println(b);
        //如何转字符串char -> 含义是 把字符串的第一个字符取到
        System.out.priontln(s5.charAt(0));//'1'字符1不是数字1
        
        //Detail 非数字无法转

	}

}