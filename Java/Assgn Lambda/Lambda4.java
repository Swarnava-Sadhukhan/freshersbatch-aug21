package Lambda;
import java.util.*;
public class Lambda4 {
	
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
			
			al.removeIf(str->str.length()%2!=0);

			System.out.println("After removing words having odd lengths:");
			for(String s:al)
				System.out.println(s);
	}
}
