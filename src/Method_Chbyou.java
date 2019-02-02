
public class Method_Chbyou {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 1;
		int b = 1;
		int c = 1;
		int time = chbyou(a,b,c);
		
		System.out.println("秒 ＝"+ time);
	}


	public static int  chbyou(int x,int y,int z) {
		return ((x*3600)+(y*60)+z);
		
	}
}
