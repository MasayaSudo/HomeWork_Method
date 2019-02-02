
public class Method_Sankaku {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 3;
		int b = 5;
		double menseki = sankaku(a,b);
		
		System.out.println("三角形の面積 ＝"+menseki);
	}


	public static double sankaku(double x,double y) {
		return (x*y)/2;
		
	}
}
