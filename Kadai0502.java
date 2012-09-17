import java.util.Scanner;

// 20120905
// 課題２：フィボナッチ数を再帰呼び出しを使って求める。事前にテストを書く。
// 1 2 3 4 5 6  7  8  9 10 11  12  13 ...
// 1 1 2 3 5 8 13 21 34 55 89 144 233 ...
//  0 1 1 2 3 5  8  13 21 34 55  89 ...（階差）
// 階差が１つ前のフィボナッチ数
// 1,0+1,1+1,1+2,2+3

public class Kadai0502 {

	static int fibonacci(int n){
		int result;

		if(n==1 || n==2){
			result = 1;
		} else {
			result = fibonacci(n-1) + fibonacci(n-2);
		}
		return result;
	}

	public static void main(String args[]){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		if(fibonacci(7)==13 && fibonacci(10)==55){
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}
		System.out.println(fibonacci(n));
	}
}
