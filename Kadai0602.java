// 20120905
// �ۑ�2�F�z��̒��ɔC�ӂ̐��l���܂܂�Ă��邩���Q���T������
// �z��́A�����ɂȂ��Ă��邱�Ƃ��O��

public class Kadai0602 {
	static boolean linear_search(int[] a, int target){
		boolean hit = false;
		int median = a.length/2;
		if(a[median] == target){
			hit = true;
		}
		if(a[median] < target){
			for(int i=median;i<a.length;i++){
				if(a[i] == target){
					hit = true;
					break;
				}
				if(a[i] > target){
					break;
				}
			}
		}
		if(a[median] > target){
			for(int i=median;i>-1;i--){
				if(a[i] == target){
					hit = true;
					break;
				}
				if(a[i] < target){
					break;
				}
			}
		}
		return hit;
	}

	public static void main(String args[]){
		int[] a = {2,4,6,8,10,12,14,16};
		System.out.println(linear_search(a,16));
	}
}
