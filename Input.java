import java.util.Scanner;//��ʾ��java.util�µ�Scanner�ർ��
public class Input{
	public static void main(String[] args){
	//Scanner���ʾ ���ı�ɨ���� ��java.util��
	//1������Scanner�����ڵİ�
	//2������Scanner����new����һ������

	Scanner myScanner = new Scanner(System.in);
	//3.�����û�����
	//������ִ�е�next����ʱ��ȴ��û�����
	System.out.println("name");
	String name = myScanner.next();//�����û�����
	System.out.println("age");
	int age = myScanner.nextInt();//�����û�����
	System.out.println("salary");
	double salary = myScanner.nextDouble();//�����û�����
	System.out.println("��Ϣ����");
	System.out.println("���� = " + name +
		"���� = " + age + "нˮ = " +salary);

	// import java.util.Scanner;
	// Scanner myScanner = new Scanner(System.in);
	// int age = myScanner.nextInt;


	}
}