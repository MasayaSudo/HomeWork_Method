//import java.util.Scanner;
public class Method_MaxValue {

	public static void main(String[] args) {
//		// TODO 自動生成されたメソッド・スタブ
//		Scanner sc = new Scanner(System.in);
		int a = 100;
		int b = 200;
		int hikaku = maxValue(a,b);
		
		System.out.println("大きい値 ＝"+hikaku);
//		sc.close();
	}


	public static int  maxValue(int x,int y) {
		if(x>y) {
			return x;
		}else {
			return y;
		}
		
	}
}
