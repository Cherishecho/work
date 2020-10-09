package work;
import java.util.Scanner;
public class nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double x,y,z;
		System.out.println("Enter a point's x- and y-coordi nates:");
		x=input.nextDouble();
		y=input.nextDouble();
		z=100-0.5*x;
		if(x<=200 && x>=0) {
			if(y<=z && y>=0) {
				System.out.println("The point is in the triangle");
			}
			else {
				System.out.println("The point is not in the triangle");
			}
		}
		else {
			System.out.println("The point is not in the triangle");
		}
	}

}
