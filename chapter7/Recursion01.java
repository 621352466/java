public class Recursion01{
	public static void main(String[] args){
		AA t1 = new AA();
        t1.test(4);
        int sum = t1.factorial(5);
        System.out.println(sum);
	}
}

class AA{
	public void test(int n ){
		if(n > 2){
			test(n - 1);
		}
		System.out.println(n);
	}
	public int factorial(int n ){
		if(n == 1){
			return 1;
		}else{
			return factorial(n-1)*n;
		}
	}
}