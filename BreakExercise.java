import java.util.Scanner;
public class BreakExercise{
	public static void main(String[] args){
    int sum = 0;
    //练习1 输出1-100的数和大于一百的第一个数字
    // for(int i = 1;i <= 100;i++){
    // 	sum = sum + i;
    // 	if(sum > 20){
    // 		System.out.println(i);
    // 		break;
    // 	}
    //练习2 用户名与密码匹配
    // String name = "林黛玉";
    // System.out.println("林黛玉".equals(name));//输出ture和false
    Scanner myScanner = new Scanner(System.in);
    String name = " ";
    String password = " ";
    int chance = 3;
    for(int i  = 1;i <= 3;i++){
    	System.out.println("请输入名字");
    	name = myScanner.next();
    	System.out.println("请输入密码");
    	password = myScanner.next();
    	if("1".equals(name) && "666".equals(password)){
    		System.out.println("登陆成功");
    		break;
    	}
    	chance--;
    	System.out.println("还有"+ chance +"次机会");
    }

    // }
    }
}