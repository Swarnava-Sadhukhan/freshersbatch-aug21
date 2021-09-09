import java.util.*;
import java.lang.Math;
class Interest
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values in order of Principal,Rate and Time(in years)");
		double pv=sc.nextInt();
		double rate=sc.nextInt();
		double time=sc.nextInt();
		System.out.println("Enter value Compounding Frequency per annum");
		double cf=sc.nextInt();
		double si=(pv*rate*time)/100;
		System.out.println("Simple Interest : "+si);
		double ci=pv*(Math.pow((1 + rate/100),(time*cf))) - pv;
		System.out.println("Compound Interest : "+ci);
	}
}