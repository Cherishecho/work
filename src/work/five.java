package work;
import java.util.Scanner;
public class five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int year=input.nextInt();
		int month=input.nextInt();
		int day=input.nextInt();
		if(month==1) {
			month=13;
		}
		if(month==2) {
			month=14;
		}
		int a=day+26*(month+1)/10+year%100+year%100/4+Math.abs(year/100)+1/4+5*(Math.abs(year/100)+1);
		int h=a%7;
		switch(h) {
		case 0:System.out.println("Day of the week is Saturday");break;
		case 1:System.out.println("Day of the week is Sunday");break;
		case 2:System.out.println("Day of the week is Monday");break;
		case 3:System.out.println("Day of the week is Tuesday");break;
		case 4:System.out.println("Day of the week is Wednesday");break;
		case 5:System.out.println("Day of the week is Thursday");break;
		case 6:System.out.println("Day of the week is Friday");break;
		}
	}

}
