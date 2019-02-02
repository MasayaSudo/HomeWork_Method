//import java.util.Scanner;
public class Method_KingakuKeisanki {

	public static void main(String[] args) {
		System.out.println("お得意Ａ :"+kingakuKeisanki(100,10,1));
		System.out.println("お得意Ｂ :"+kingakuKeisanki(100,10,2));
		System.out.println("クーポン :"+kingakuKeisanki(100,10,3));
		System.out.println("なし :"+kingakuKeisanki(100,10,4));

	}

	public static int kingakuKeisanki(int x,int y,int z) {
		
		switch(z) {
		case 1:
			return x*y*(100-15)/100;
			
		case 2:
			return x*y*(100-10)/100;
			
		case 3:
			return x*y*(100-5)/100;
			
		case 4:
			return	x*y*(100-0)/100;

		default:
			System.out.println("数値がただしくありません。");
			break;
		}
		return z;
		
	}
}
