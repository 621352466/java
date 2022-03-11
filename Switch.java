import java.util.Scanner;
public class Switch{
	public static void main(String[] args){
    Scanner myScanner = new Scanner(System.in);
    System.out.println("请输入a-g");
    char c1 = myScanner.next().charAt(0);
    //switch语句中表达式的返回值必须是（byte short int char enum[枚举] String
    //表达式数据类型 应该与case后的常量类型一致 或者是可以自动转成相互比较的类型
    //case子句中的值必须是常量或者是常量表达式 不能是变量
    //如果没有写break 程序会顺序执行到switch结尾 除非遇到break
    switch(c1){
    case 'a' :
    	System.out.println("1");
    	break;
    case 'b' :
    	System.out.println("2");
    	break;
   case 'c' :
        System.out.println("3");
        break;
   default:
   	    System.out.println("wrong");

        }
    System.out.println("out");
	}
}