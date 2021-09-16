package Lambda;

import java.util.*;
import java.util.function.Supplier;

enum Status{
	ACCEPTED,COMPLETED,PROCESSING,DISPATCHED
}

class Order {

	String name;
	Status status;
	int price;
	
	Order(String name, Status status, int price) {
		super();
		this.name=name;
		this.status=status;
		this.price=price;
	}
	public Supplier<Boolean> priceCheck=()->this.price>10000;
	public Supplier<Boolean> statusCheck=()->this.status==Status.ACCEPTED || this.status==Status.COMPLETED;

	@Override
	public String toString() {
		return "" + this.name+" "+this.status+" "+this.price;
	}
}

public class Lambda2 {

	public static void main(String[] args) {
		List<Order> orders = Arrays.asList(
				new Order("Cabinets",Status.ACCEPTED,20000),
				new Order("Desktops",Status.ACCEPTED,16000),
				new Order("Mouses",Status.ACCEPTED,5000),
				new Order("Laptops",Status.COMPLETED,50000),
				new Order("Routers",Status.DISPATCHED,15000),
				new Order("Webcams",Status.PROCESSING,6000)
				);
		
		for(Order o:orders)
		{
			if(o.priceCheck.get() && o.statusCheck.get())
			{
				System.out.println(o.toString());
			}
		}
	}  
}
