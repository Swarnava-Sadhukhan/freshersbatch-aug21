package Lambda;

import java.util.ArrayList;

public class Lambda6 {

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
		
		al.replaceAll(str->str.toUpperCase());

		System.out.println("After replacing every element with its upper case equivalent");
		for(String s:al)
			System.out.println(s);
	}
}
