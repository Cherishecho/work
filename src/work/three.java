package work;
import java.util.Scanner;
public class three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=100+(int)(Math.random()*999);
		int i=input.nextInt();
		int p=0;
		if(n==i) {
			System.out.println("10000 dollars");
		}
		else {
			int a=i/100;
			int b=i/10%10;
			int c=i%10;
			while(n>0) {
				int d=n%10;
				n=n/10;
				if(d==a||d==b||d==c) {
					p=p+1;
				}
				d=0;
			}
			if(p==1) {
				System.out.println("1000 dollars");
			}
			else if(p==3) {
				System.out.println("3000 dollars");
			}
		}
	}

}
