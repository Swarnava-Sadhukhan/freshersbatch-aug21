package Lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda5 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Maruti");
		al.add("Toyota");
		al.add("Hyundai");
		al.add("Tata");
		al.add("Mahindra");
		al.add("MG Motors");
		al.add("Citroen");
		al.add("Jeep");
		al.add("Ford");
		
		StringBuilder finalstr=new StringBuilder();
		
		Consumer<String> cnstr=s->finalstr.append(s.charAt(0));
		
		for(String s:al)
			cnstr.accept(s);
			
		System.out.println("Final string : "+finalstr);		
	}

}
