public class Method1{
	public static void main(String[] args){
		//����ʹ��
		Person p = new Person();
		p.speak();
		p.cal();
		p.cal1(6);
		
		int returnsum = p.getSum(1,2);
		System.out.println(returnsum);
    
	}
}

class Person{
	String name;
	int age;
	//��Ա����
	//���speak ��Ա���� ���������һ�����ˡ�
	public void speak(){
		System.out.println("����һ������");
	}

	//���cal ��Ա���� ����1+...1000���
	public void cal(){
    int sum = 0;
    for(int i = 0;i <= 1000;i++){
    sum += i;
    }
    System.out.println(sum);

	}
    
    //����n ���1+....n
	public void cal1(int n){
	int sum = 0;
    for(int i = 0;i <= n;i++){
    sum += i;
    }
    System.out.println(sum);

	}


	//���������� ����������ĺ�
	public int getSum(int num1, int num2){
		int sum = num1 + num2;
		return sum;

	}
}