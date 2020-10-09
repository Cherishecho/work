package work;
import java.util.Scanner;
public class six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double x=input.nextDouble();
		double y=input.nextDouble();
		if(x*x+y*y<=100) {
			System.out.println("Point ("+x+","+y+")"+"is in the circle");
		}
		else {
			System.out.println("Point ("+x+","+y+")"+"is not in the circle");
		}
	}

}
