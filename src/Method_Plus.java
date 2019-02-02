//import java.util.Scanner;
public class Method_Plus {

	public static void main(String[] args) {
//		// TODO 自動生成されたメソッド・スタブ
//		Scanner sc = new Scanner(System.in);
//		int a = 100;
//		int b = 200;
//		int  = plusCheck(a,b);
		
		System.out.println("1は、１以上ですか ＝"+plusCheck(1));
		System.out.println("０は、１以上ですか ＝"+plusCheck(0));
//		sc.close();
	}


	public static boolean  plusCheck(int x) {
		if(x>=1) {
			return true;
		}else {
			return false;
		}
		
	}
}
