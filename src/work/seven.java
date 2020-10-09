package work;
import java.util.Scanner;
public class seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double x=input.nextDouble();
		double y=input.nextDouble();
		if(x<=5 && x>=-5) {
			if(y<=2.5 && y>=-2.5) {
				System.out.println("Point ("+x+","+y+")"+"is in the rectangle");
			}
			else {
				System.out.println("Point ("+x+","+y+")"+"is not in the rectangle");
			}
		}
		else {
			System.out.println("Point ("+x+","+y+")"+"is not in the rectangle");
		}
	}

}
