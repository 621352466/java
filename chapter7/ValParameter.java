public class ValParameter{
	public static void main(String[] args){
    //���԰Ѷ��ͬ��ͬ���ܵ�����������ͬ�ķ�����װ��һ������ ͨ���ɱ����ʵ��
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
    //int...��ʾ���ܵ��ǿɱ���� ������int �����Խ��ܶ��int��0-�ࡪ��
    //ʹ�ÿɱ����ʱ ���Ե���������ʹ�� ��nums���Ե�������
    //�ɱ������ʵ�ο���������
    //�ɱ�����ı��ʾ�������
    //�ɱ�������Ժ���ͨ���͵Ĳ���һ������β��б� �����뱣֤�ɱ���������
    //һ���β��б�ֻ����һ���ɱ����
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