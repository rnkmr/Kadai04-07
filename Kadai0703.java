// 20120906
// 課題：挿入ソートで、昇順に並べる

public class Kadai0703 {
    static void insertion_sort(int[] array) {
       	for(int i=1;i<array.length;i++){
    		int j;
    		int tmp = array[i];
    		for(j=i;j>0 && array[j-1]>tmp;j--){
    			array[j] = array[j-1];
    		}
    		array[j] = tmp;
    	}
       	// -----失敗作ここから-----
//    	int[] tmp = new int[array.length];
//    	if(array[0]>array[1]){
//    		tmp[0] = array[0];
//    		array[0] = array[1];
//    		array[1] = tmp[0];
//    	}
//    	for(int i=2;i<array.length;i++){
//    		for(int j=0;j<i;j++){
//    			if(array[i]>array[j]){
//    				for(int k=1;j+k<=i;k++){
//    				tmp[0] = array[j+k];
//    				array[j+k] = array[i];
//    				tmp[1] = array[j+k+1];
//    				array[j+k+1] = array[j+k];
//    				tmp[2] = array[j+k+2];
//    				array[j+k+2] = array[j+k+1];
//    				}
//    			}
//    		}
//    	}
       	// -----ここまで-----
    }

    static boolean check_sorted(int[] array) {
	boolean sorted = true;

	for (int i = 1; i < array.length; ++i) {
	    if(array[i-1] > array[i]) {
		sorted = false;
	    }
	}

	return sorted;
    }

    public static void main(String[] args) {
	//	int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int[] a = { 7, 9, 0, 3, 1, 8, 6, 2, 5, 4 };


	insertion_sort(a);
	System.out.println(check_sorted(a));
    }
}
