public class Puzzle{
	public static void main(String[] args){
    //�ö�ά���鴴���Թ� 8*7
	// 0��ʾû���ϰ���ĸ��� 1��ʾ���ϰ�
	//  #######
	//  #     #
	//  #     #
	//  ###   #
	//  #     #
	//  #     #
	//  #     #
	//  #######    
    int map[][] = new int[8][7];
    for(int i = 0;i < 7;i++){
    	map[0][i] = 1;
    	map[7][i] = 1;
    }
    for(int i = 0;i < 8;i++){
    	map[i][0] = 1;
    	map[i][6] = 1;
    }
    map[3][1] = 1;
    map[3][2] = 1;

    //�����ͼ
    for(int i = 0;i < map.length;i++){
    	for(int j = 0;j < map[i].length;j++){
    		System.out.print( map[i][j]);
    	}
    	System.out.println();
    }

    AA a = new AA();
    a.findWay(map,1,1);
    System.out.println("��·�������");
    for(int i = 0;i < map.length;i++){
    	for(int j = 0;j < map[i].length;j++){
    		System.out.print( map[i][j]);
    	}
    	System.out.println();
    }
	
	}
}

class AA{
    //�ݹ�
    //�ҵ�true ����false
    //map���Թ� i j��ʾλ��
    //��ʼλ��1��1  �յ�6��5
    //��Ҫ�涨mapֵ���� 0ͨ 1�ϰ� 2��ʾ������ 3��ʾ�߹���������·
    //��map[6][5] = 2ʱ˵���ҵ�ͨ· �����˳� ���������
    //ȷ������  �� -> �� -> �� -> ��
    public boolean findWay(int map[][],int i ,int j){
        if(map[6][5] == 2){
        	return true;
        }else{
        	if(map[i][j] == 0){//������
                //�ٶ�������ͨ
                map[i][j] = 2;
                //ʹ�ò��� ȷ���Ƿ���Ŀ�����
                if(findWay(map,i+1,j)){
                	return true;
                }else if(findWay(map,i,j+1)){
                	return true;
                }else if(findWay(map,i - 1,j)){
                	return true;
                }else if(findWay(map,i,j-1)){
                	return true;
                }else{
                	map[i][j] = 3;
                	return false;
                }

        	}else{//1,2,3
                return false;
        	}
        }

    }
	 
}