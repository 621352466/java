public class Exercise{
	public static void main(String[] args){

		AA a = new AA();
		if(a.isOdd(2)){
			System.out.println("����");
		}else{
			System.out.println("ż��");
		}

		a.print(4,5,"#");

	}
}
class AA{
	//��������boolean
	//����isOdd
	//�ж�һ��������������ż��

	public boolean isOdd(int n){
	// 	if(n % 2 != 0){
	// 		return true;
	// 	}else{
	// 		return false;
	// 	}

		//return num % 2 != 0 ? true; false;

		return n%2 != 0;
	 }

	 //������ �� �ַ���ӡ ��Ӧ�������������ַ�
	 //���� ��4 ��4 �ַ�# ��ӡ
	 //  ####
	 //  ####
	 //  ####
	 //  ####

	 public void print(int row,int col,String c){
	 	for(int i = 0;i < row;i++){
	 		for(int j = 0;j <col;j++){
	 			System.out.print(c);
	 		}
	 		System.out.println();
	 	}
	 }

	
}