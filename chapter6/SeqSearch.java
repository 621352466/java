import java.util.Scanner;
public class SeqSearch{
	public static void main(String[] args){
	String names[] = {"һ","��","��"};
	Scanner myScanner = new Scanner(System.in);
	System.out.println("����������");
	String find = myScanner.next();
	int index = 0;
	for(int i = 0;i < names.length;i++){
		if(find.equals(names[i])){
			System.out.println("1");
			System.out.println(i);
			index = 1;
			break;
		}
	}
	if(index == 0){
		System.out.println("û���ҵ�");
	} 

	}
}