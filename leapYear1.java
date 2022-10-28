import java.util.Scanner;
class leapYear1{
	public static void main(String[] args){
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the year");
		
		// i = 2000
		int year = sc.nextInt();
		boolean leap = false;
		
		if(year%4==0)
		{
			leap=true;
		if(year%100==0)
		{
			if(year%400==0)
			{
				leap=true;
			}
			else
			{
				leap=false;
			}
			
		}
		}
		if(leap==true)
		{
			System.out.println(year+" is a leap year");
		}
		else
		{
			System.out.println(year+" is not a leap year");
		}
		
			
	}
}