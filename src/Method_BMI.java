import java.util.Scanner;
public class Method_BMI {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.println("身長(m)");
		double a = sc.nextDouble();
		System.out.println("体重(kg)");
		double b = sc.nextDouble();
		
		double c = bmi(a,b);
		
		System.out.println("BMI ＝"+c);
		sc.close();
	}


	public static double  bmi(double x,double y) {
		return y/(x*x);
		
	}
}
