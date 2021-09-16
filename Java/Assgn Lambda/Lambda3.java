package Lambda;
import java.util.function.*;
public class Lambda3 {

	public static void main(String[] args) {
		Predicate<Integer> pr= a->(a>18);
		Function<String,String> fn=Lambda3::display;
		System.out.println(fn.apply("Brock"));
		Consumer<Integer> cn=(Integer v)-> {
			Supplier<String> sup=()->{
				if(pr.test(v))
					return "Eligible";
				else
					return "Not Eligible";
			};
			System.out.println(sup.get()); 
		};
		cn.accept(23);
	}
	static String display(String n)
	{
		return n+", to vote you are:";
	}
}
