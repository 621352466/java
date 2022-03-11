import java.util.Scanner;
public class SwitchPractice{
	public static void main(String[] args){
	System.out.println("Please enter your score(0-100)");
	Scanner mySacnner = new Scanner(System.in);
	double score = mySacnner.nextDouble();
	if( score >= 0 && score <= 100){
        switch((int)(score/60)){
        case 0 :
        	System.out.println("failed");
        	break;
        case 1 :
        	System.out.println("pass");
        	break;
        
        }
	}else{
		System.out.println("wrong");
	}
  }
}