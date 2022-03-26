public class Puzzle{
	public static void main(String[] args){
    //用二维数组创建迷宫 8*7
	// 0表示没有障碍物的格子 1表示有障碍
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

    //输出地图
    for(int i = 0;i < map.length;i++){
    	for(int j = 0;j < map[i].length;j++){
    		System.out.print( map[i][j]);
    	}
    	System.out.println();
    }

    AA a = new AA();
    a.findWay(map,1,1);
    System.out.println("找路情况如下");
    for(int i = 0;i < map.length;i++){
    	for(int j = 0;j < map[i].length;j++){
    		System.out.print( map[i][j]);
    	}
    	System.out.println();
    }
	
	}
}

class AA{
    //递归
    //找到true 否则false
    //map是迷宫 i j表示位置
    //初始位置1，1  终点6，5
    //需要规定map值含义 0通 1障碍 2表示可以走 3表示走过但是是死路
    //当map[6][5] = 2时说明找到通路 可以退出 否则继续找
    //确定策略  下 -> 右 -> 上 -> 左
    public boolean findWay(int map[][],int i ,int j){
        if(map[6][5] == 2){
        	return true;
        }else{
        	if(map[i][j] == 0){//可以走
                //假定可以走通
                map[i][j] = 2;
                //使用策略 确定是否真的可以走
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