public class HanoiTower{
	public static void main(String[] args){
		T tower = new T();
		
		tower.move(3,'A','B','C');

	}
}

class T{
	//num��ʾ�ƶ��ĸ��� abc�ֱ��ʾabc��
	public void move(int num,char a,char b,char c){
		//���ֻ��һ���� num = 1
		if(num == 1){
			System.out.println(a + "->" +c);
		}else{
			//����ж���� ���Կ������� ������ĺ��������е�
			//1.�ƶ��������е��̵�b ����c
			move(num - 1,a,c,b);
			//2.������������ƶ���c
			System.out.println(a + "->" + c);
			//3.��b�������ƶ���c ����a
			move(num - 1,b,a,c);
		}

	}
}