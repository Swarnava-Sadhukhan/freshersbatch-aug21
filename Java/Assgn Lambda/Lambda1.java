
@FunctionalInterface
interface Math{
	public double perform(double a,double b);
}

public class Lambda1 {

	public static void main(String[] args) {
		Math add= (double a,double b) -> a+b;
		System.out.println("Sum="+add.perform(30, 20));
		Math sub= (double a,double b) -> a-b;
		System.out.println("Diff="+sub.perform(30, 20));
		Math mul= (double a,double b) -> a*b;
		System.out.println("Product="+mul.perform(10, 120));
		Math div= (double a,double b) -> a/b;
		System.out.println("Quotient="+div.perform(300, 15));
	}

}
