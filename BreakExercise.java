import java.util.Scanner;
public class BreakExercise{
	public static void main(String[] args){
    int sum = 0;
    //��ϰ1 ���1-100�����ʹ���һ�ٵĵ�һ������
    // for(int i = 1;i <= 100;i++){
    // 	sum = sum + i;
    // 	if(sum > 20){
    // 		System.out.println(i);
    // 		break;
    // 	}
    //��ϰ2 �û���������ƥ��
    // String name = "������";
    // System.out.println("������".equals(name));//���ture��false
    Scanner myScanner = new Scanner(System.in);
    String name = " ";
    String password = " ";
    int chance = 3;
    for(int i  = 1;i <= 3;i++){
    	System.out.println("����������");
    	name = myScanner.next();
    	System.out.println("����������");
    	password = myScanner.next();
    	if("1".equals(name) && "666".equals(password)){
    		System.out.println("��½�ɹ�");
    		break;
    	}
    	chance--;
    	System.out.println("����"+ chance +"�λ���");
    }

    // }
    }
}