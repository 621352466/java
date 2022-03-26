public class Method2{
	public static void main(String[] args){
    //遍历一个数组 输出各元素
		int map[][] = {{0,0,1},{1,1,1,},{1,1,3}};

		Mytool tool = new Mytool();
		tool.printArr(map);

		Mytool a = new Mytool();
		int sum[] = a.getSum(1,4);
		System.out.println(sum[0]);
		System.out.println(sum[1]);
		

	}
}

class Mytool{
	public void printArr(int map[][]){
		for(int i = 0;i < map.length;i++){
			for(int j = 0;j < map[i].length;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
	//输出两个结果用数组
	public int[] getSum(int n1,int n2){
		int sum[] = new int[2];
		sum[0] = n1 + n2;
		sum[1] = n1 - n2;
		return sum;
		
	}
}