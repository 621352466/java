public class Stars{
	public static void main(String[] args){
		//break�������ڶ��Ƕ�׵�������ʱ ����ͨ����ǩָ��Ҫ��ֹ��ʱ��һ������
		lable1:
		for(int i = 0; i < 4;i++){
		lable2:	
			for(int j = 0;j < 10;j++){
				if(j == 2){
					//break;//�ȼ��� break lable2 (�����)
					break lable1;//j == 2ʱ����ѭ������ 01
				}
			}
			System.out.println(i);//01010101
		}
	}
}