// 20120905
// 課題１：配列の中に任意の数値が含まれているか探索する

public class Kadai0601 {
	static boolean linear_search(int[] a, int n){
		boolean hit = false;
		for(int i=0;i<a.length;i++){
			if(a[i]==n){
				hit = true;
				break;
			}
		}
		return hit;
	}

	public static void main(String args[]){
		int[] a = {10,11,12,13,14,15};
		System.out.println(linear_search(a,15));
	}
}
