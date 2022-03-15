public class ArrayExercise{
	public static void main(String[] args){
    // char element[] = new char[26];
    // for(int i = 0;i < element.length;i++){
    // 	element[i] = (char)('A' + i);
    // }
    // System.out.println("สýื้");
    // for(int i = 0;i < element.length;i++){
    // 	System.out.print(element[i] + " ");
    // }

		int arr[] = {4,-1,9,10,23};
		int max = arr[0];
		for(int i = 0;i < arr.length;i++){
			if(max < arr[i]){
				max = arr[i];
			}
		}
		System.out.print(max);
	}
}
