public class Continue{
	public static void main(String[] args){
		// int i = 1;
		// while(i <= 4){
		// 	i++;
		// 	if(i == 2){
		// 		continue;
		// 	}
		// 	System.out.println(i);//3 4 5
		// }


		//lable
		lable1:
		for(int j = 0;j < 4;j++){
			lable2:
			for(int i = 0;i < 10;i++){
				if(i ==2){
					//continue;//equals.continue lable2 //0134...0134...
					continue lable1;//01010101
					//break�ǽ���forѭ��
					//continue�ǽ�������ѭ��
					//return���ڷ���ʱ��ʾ�������� ����main��ʾֱ�ӽ�������
				}
				System.out.println(i);
			}
		}
	}
}