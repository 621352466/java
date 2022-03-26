public class Recursion02{
	public static void main(String[] args){
		AA a = new AA();
		int sum = a.Fbnq(5);
		System.out.println(sum);
		int p;
		for(int i = 10;i > 0;i--){
            p = a.Peach(i);
            System.out.println(p);
    }
		

	}
}

class AA{
	public int Fbnq(int n){
		if(n == 1 || n == 2){
			return 1;
		}else{
			return Fbnq(n - 1) + Fbnq(n - 2);
		}
	}

	public int Peach(int day ){
		if(day == 10){
			return 1;
		}else{
			return (Peach(day+1) + 1)*2;

		}

	}
}