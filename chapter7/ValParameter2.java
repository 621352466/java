public class ValParameter2{
	public static void main(String[] args){
		AA a = new AA();
		
		a.test("tom",86.3,56.6,45.5);

	}
}

class AA{
	public void test(String name,double...nums){
		double sum = 0;
		for(int i = 0;i < nums.length;i++){
			sum += nums[i];
		}
		
		System.out.println(name + sum);



	}
}