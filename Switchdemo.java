import java.util.Scanner;
class Switchdemo{
	public static void main(String[] args){
	
	Scanner in = new Scanner(System.in);
	System.out.println("Select the Number for Date");
	int day = in.nextInt();
	System.out.println("Select the Number for Date");
	switch(day){
	case 0: System.out.println("the day is Sunday");
	break;
	case 1: System.out.println("the day is Monday");
	break;
	case 2: System.out.println("the day is Tuesday");
	break;
	case 3: System.out.println("the day is Wednesday");
	break;
	case 4: System.out.println("the day is Thursday");
	break;
	case 5: System.out.println("the day is Friday");
	break;
	case 6: System.out.println("the day is Saturday");
	break;
	default: System.out.println("the day is not a valid day");
	}
}
}