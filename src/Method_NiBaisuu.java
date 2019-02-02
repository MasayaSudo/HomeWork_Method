import java.util.Scanner;
public class Method_NiBaisuu {

	public static void main(String[] args) {
//		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int x =sc.nextInt();
//		int b = 200;
//		int  = plusCheck(a,b);
		
		System.out.println("2の倍数ですか ＝"+niBaisuu(x));
		
		sc.close();
	}


	public static boolean  niBaisuu(int x) {
		if(x%2==0) {
			return true;
		}else {
			return false;
		}
		
	}
}
