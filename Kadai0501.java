// 20120905
// �ۑ�P�F�ċA�Ăяo�����g���ĊK������߂�B���O�Ƀe�X�g�������B
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
