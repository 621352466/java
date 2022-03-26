public class ValParameter{
	public static void main(String[] args){
    //可以把多个同名同功能但参数个数不同的方法封装成一个方法 通过可变参数实现
	AA a = new AA();
	System.out.println(a.sum(1,2,3));
	}
}

class AA{
	// public int sum(int n1,int n2){
 //    return n1+n2;
	// }
	// public int sum(int n1,int n2,int n3){
	// 	return n1+n2+n3;
	// }
    //int...表示接受的是可变参数 类型是int 即可以接受多个int（0-多—）
    //使用可变参数时 可以当作数组来使用 即nums可以当成数组
    //可变参数的实参可以是数组
    //可变参数的本质就是数组
    //可变参数可以和普通类型的参数一起放在形参列表 但必须保证可变参数在最后
    //一个形参列表只能有一个可变参数
	public int sum(int...nums){
		int res = 0;
		for(int i = 0;i < nums.length;i++){
			res += nums[i];
		}
		return res;

	}

	public void f1(String str,double...nums){
		
	}
}