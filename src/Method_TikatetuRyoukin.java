//import java.util.Scanner;
public class Method_TikatetuRyoukin {

	public static void main(String[] args) {
		String eki ="琴似駅";
		String eki0 ="円山公園";
		String eki1 ="バスセンター前";
		String eki2 ="白石までは、";
		String eki3 ="南郷18丁目";
		String eki4 ="新さっぽろ";
		
		
		System.out.println(eki+"から、"+eki0+"までは、"+ryoukinFromKotoni(0)+"円");
		System.out.println(eki+"から、"+eki1+"までは、"+ryoukinFromKotoni(1)+"円");
		System.out.println(eki+"から、"+eki2+"までは、"+ryoukinFromKotoni(2)+"円");
		System.out.println(eki+"から、"+eki3+"までは、"+ryoukinFromKotoni(3)+"円");
		System.out.println(eki+"から、"+eki4+"までは、"+ryoukinFromKotoni(4)+"円");

	}

	public static int ryoukinFromKotoni(int x) {
		
		switch(x) {
		case 0:
			return 200;
			
		case 1:
			return 250;
			
		case 2:
			return 290;
			
		case 3:
			return	320;
			
		case 4:
			return 350;
		
		default:
			System.out.println("数値がただしくありません。");
			break;
		}
		return x;
		
	}
}
