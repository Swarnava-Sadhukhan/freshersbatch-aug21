package Lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Lambda7 {

	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<>();
		m.put(1,"Maruti");
		m.put(2,"Toyota");
		m.put(3,"Hyundai");
		m.put(4,"Tata");
		m.put(5,"Mahindra");
		m.put(6,"MG Motors");
		m.put(7,"Citroen");
		m.put(8,"Jeep");
		m.put(9, "Ford");

		StringBuilder finalstr=new StringBuilder();
		
		Consumer<Map.Entry<Integer,String>> crtstr= a->finalstr.append(a.getKey()+a.getValue());
		
		for(Map.Entry<Integer,String> e:m.entrySet())
			crtstr.accept(e);
		
		System.out.println("Final string : "+finalstr);	
	}

}
