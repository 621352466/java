public class OverLoad{
	public static void main(String[] args){
        //java中允许重名方法 但要求形参列表不一样
		// System.out.println(100);
		// System.out.println("h");
		MyCalculator mc = new MyCalculator();
		System.out.println(mc.calculate(1,1,2));

	}
}

class MyCalculator{
	public int calculate(int n1,int n2){
		return n1+n2;
	}
	public double calculate(double n1,int n2){
		return n1+n2;
	}
	public double calculate(int n1,double n2){
		return n1+n2;
	}
	public int calculate(int n1,int n2,int n3){
		return n1+n2+n3;
	}
	
}