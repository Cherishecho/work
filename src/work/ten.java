package work;
import java.util.Scanner;
public class ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
        System.out.print("Enter rl's center x-, y-coordinates, width , and height:");
        double x1=input.nextDouble();
        double y1=input.nextDouble();
        double w1=input.nextDouble();
        double h1=input.nextDouble();
        System.out.print("Enter r2 's center x-, y-coordi nates, width, and height:");
        double x2=input.nextDouble();
        double y2=input.nextDouble();
        double w2=input.nextDouble();
        double h2=input.nextDouble();
 
        double inXMin=x1-(w1-w2)/2;
        double inXMax=x1+(w1-w2)/2;
        double inYMin=y1-(h1-h2)/2;
        double inYMax=y1+(h1-h2)/2;
 
        double outXMin=x1-(w1+w2)/2;
        double outXMax=x1+(w1+w2)/2;
        double outYMin=y1-(h1+h2)/2;
        double outYMax=y1+(h1+h2)/2;
        if(x2>=inXMin&&x2<=inXMax&&y2>=inYMin&&y2<=inYMax){
            System.out.println("r2 is inside rl");
        }else if(x2<=outXMin||x2>=outXMax||y2<=outYMin||y2>=outYMax){
            System.out.println("r2 does not overlap rl");
        }else{
            System.out.println("r2 overlaps rl!");
        }
    }
}
