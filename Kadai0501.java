// 20120905
// 課題１：再帰呼び出しを使って階乗を求める。事前にテストを書く。
import java.util.Scanner;
public class Kadai0501 {

	static int factorial(int n){
		int result;
		if(n==1){
			result = n * 1;
		} else {
		result = n * factorial(n-1);
		}
		return result;
	}

	public static void main(String args[]){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		if(factorial(6)==720){
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}
		System.out.println(factorial(n));
	}
}
