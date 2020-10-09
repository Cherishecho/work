package work;
import java.util.Scanner;
public class four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		if(a+b>c||a+c>b||b+c>a) {
			int d=a+b+c;
			System.out.println(d);
		}
		else {
			System.out.println("这些输入值不合法");
		}
	}

}
