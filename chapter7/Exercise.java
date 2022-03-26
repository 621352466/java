public class Exercise{
	public static void main(String[] args){

		AA a = new AA();
		if(a.isOdd(2)){
			System.out.println("奇数");
		}else{
			System.out.println("偶数");
		}

		a.print(4,5,"#");

	}
}
class AA{
	//返回类型boolean
	//名字isOdd
	//判断一个数是奇数还是偶数

	public boolean isOdd(int n){
	// 	if(n % 2 != 0){
	// 		return true;
	// 	}else{
	// 		return false;
	// 	}

		//return num % 2 != 0 ? true; false;

		return n%2 != 0;
	 }

	 //根据行 列 字符打印 对应行数和列数的字符
	 //比如 行4 列4 字符# 打印
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