// 20120904
// �ۑ�2�F���͂��ꂽ�z��̗v�f�̐ς����߂郁�\�b�h
import java.util.Scanner;
public class Kadai0402 {
	static int multiply(int[] a){
		int result = 1;
		for(int i=0;i<a.length;i++){
			result *= a[i];
		}
		return result;
	}

	static void multiplyTest(){
		int[] a = {2,3,4};
		if(multiply(a)==24){
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}

		int[] b = {5,6,7};
		if(multiply(b)==210){
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}
	}

	public static void main(String args[]){
		Scanner stdIn = new Scanner(System.in);
		int n = 5;
		int[] array = new int[n];
		for(int i=0;i<n;i++){
			array[i] = stdIn.nextInt();
		}
		multiplyTest();
		System.out.println(multiply(array));
	}
}
