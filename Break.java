public class Stars{
	public static void main(String[] args){
		//break语句出现在多层嵌套的语句块中时 可以通过标签指明要终止的时哪一层语句块
		lable1:
		for(int i = 0; i < 4;i++){
		lable2:	
			for(int j = 0;j < 10;j++){
				if(j == 2){
					//break;//等价于 break lable2 (最近的)
					break lable1;//j == 2时整个循环结束 01
				}
			}
			System.out.println(i);//01010101
		}
	}
}