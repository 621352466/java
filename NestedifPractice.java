import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;

public class NestedifPractice{
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		int month = c.get(Calendar.MONTH) + 1;
		if(month >= 4 && month <= 10){
			Scanner myScanner = new Scanner(System.in);
            System.out.println("Please enter your age");
            int age = myScanner.nextInt();
            if(age >= 18 && age <= 60){
            	System.out.println("60r");
            }else if(age < 18){
            	System.out.println("30r");
            }else if(age > 60){
            	System.out.println("20r");
            }else{
            	System.out.println("Your input is incorrect,please re-enter it");
            }

		}else{
			Scanner myScanner = new Scanner(System.in);
            System.out.println("Please enter your age");
            int age = myScanner.nextInt();
            if(age >= 18 && age <= 60){
            	System.out.println("40r");
            }else if(age < 18 && age > 60){
            	System.out.println("20r");
            }else{
            	System.out.println("Your input is incorrect,please re-enter it");
            }

		}
	}
}