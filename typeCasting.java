class typeCasting {
public static void main(String[] args)
{
//Widening

short a = 24;
short b = 15;

int c= a+b;

System.out.println(c);


//Narrowing

int d = 125426;

short e = (short)d; //Data Loss
System.out.println(e);
}

}