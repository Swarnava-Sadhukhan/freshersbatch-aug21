package Lambda;
import java.util.*;
public class Lambda8 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(20);
		al.add(30);
		al.add(130);
		al.add(10);
		al.add(69);
		al.add(240);
		Thread lambdaThread= new Thread(()->al.forEach(num->System.out.println("Number "+num)));
		lambdaThread.run();	
	}
}
