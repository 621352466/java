public class HanoiTower{
	public static void main(String[] args){
		T tower = new T();
		
		tower.move(3,'A','B','C');

	}
}

class T{
	//num表示移动的个数 abc分别表示abc塔
	public void move(int num,char a,char b,char c){
		//如果只有一个盘 num = 1
		if(num == 1){
			System.out.println(a + "->" +c);
		}else{
			//如果有多个盘 可以看成两个 最下面的和上面所有的
			//1.移动上面所有的盘到b 借助c
			move(num - 1,a,c,b);
			//2.把最下面的盘移动到c
			System.out.println(a + "->" + c);
			//3.把b所有盘移动到c 借助a
			move(num - 1,b,a,c);
		}

	}
}