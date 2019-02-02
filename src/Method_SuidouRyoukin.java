//import java.util.Scanner;
public class Method_SuidouRyoukin {

	public static void main(String[] args) {
		String siyou ="使用量";
		String line ="の時の従量料金＝";
		
		
		
		
		System.out.println(siyou+"   0"+line+suidouRyoukin(1));
		System.out.println(siyou+"  10"+line+suidouRyoukin(2));
		System.out.println(siyou+"  11"+line+suidouRyoukin(3));
		System.out.println(siyou+"  30"+line+suidouRyoukin(4));
		System.out.println(siyou+"  31"+line+suidouRyoukin(5));
		System.out.println(siyou+" 500"+line+suidouRyoukin(6));
		System.out.println(siyou+" 501"+line+suidouRyoukin(7));
		System.out.println(siyou+"1001"+line+suidouRyoukin(8));



	}

	public static int suidouRyoukin(int x) {
		
		switch(x) {			
		case 1:
			return 0;
			
		case 2:
			return 0;
			
		case 3:
			return	200;
			
		case 4:
			return 230;
		case 5:
			return 265;
		case 6:
			return 330;
		case 7:
			return 350;
		case 8:
			return 375;
		
		default:
			System.out.println("数値がただしくありません。");
			break;
		}
		return x;
		
	}
}
