import java.util.Scanner;
public class NestedIf{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("grade");
		double score = myScanner.nextDouble();
		if(score > 8.0){
            System.out.println("Please enter your gender");
            char gender = myScanner.next().charAt(0);//���ַ�����һ���ַ��õ�
            if(gender == '��'){
            	System.out.println("enter the men's group");
            }else if(gender == 'Ů'){
            	System.out.println("enter the women's group");
            }else{
            	System.out.println("Your input is incorrect,please re-enter it");
            }
		}else{
			System.out.println("out");
		}

	}
}