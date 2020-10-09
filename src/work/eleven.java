package work;
import java.util.Scanner;
public class eleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter circlel's center x-, y-coordi nates, and radius:");
		double x=input.nextDouble();
		double y=input.nextDouble();
		double r=input.nextDouble();
		System.out.print("Enter circle2 's center x-, y-coordinates, and radius:");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		double r1=input.nextDouble();
		double  range;
		range=(x-x1)*(x-x1)+(y-y1)*(y-y1);
		if(range<=(r-r1)*(r-r1)) {
			System.out.println("circle2 is inside circlel");
		}
		else if(range>=(r-r1)*(r-r1) && range<=(r+r1)*(r+r1))
			System.out.println("circle2 overlaps circlel");
		else if(range>(r+r1)*(r+r1)) {
			System.out.println("circle2 does not overlaps circlel");
		}
	}

}
