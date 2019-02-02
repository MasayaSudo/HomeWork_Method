import java.util.Scanner;
public class Method_SanBaisuu {

	public static void main(String[] args) {
//		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int x =sc.nextInt();
//		int b = 200;
//		int  = plusCheck(a,b);
		
		System.out.println("3の倍数ですか ＝"+sanBaisuu(x));
		
		sc.close();
	}


	public static boolean  sanBaisuu(int x) {
		if(x%3==0) {
			return true;
		}else {
			return false;
		}
		
	}
}
