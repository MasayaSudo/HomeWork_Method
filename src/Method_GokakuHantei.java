//import java.util.Scanner;
public class Method_GokakuHantei {

	public static void main(String[] args) {
//		// TODO 自動生成されたメソッド・スタブ
//		Scanner sc = new Scanner(System.in);
		//	int x =sc.nextInt();
//		int b = 200;
//		int  = plusCheck(a,b);
		boolean hantei = goukakuHantei(80,70);		
		System.out.println("合格か ＝"+hantei);
		hantei = goukakuHantei(69,70);		
		System.out.println("合格か ＝"+hantei);
		
//		sc.close();
	}


	public static boolean  goukakuHantei(int x,int y) {
		if(x >= 70) {
			return true;
		}else {
			return false;
		}
		
	}
}
