import java.util.HashSet;

class Employee1{
	private int id;
	private String name;
	private int sal;
	private String dept;
	
	
	public Employee1(int id, String name, int sal, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.dept = dept;
	}


	public void displayDetails() {
		System.out.println(id+"\t"+name+"\t"+sal+"\t"+dept);
	}
	
}
public class Hash {

	public static void main(String[] args) {
		HashSet<Employee1> set=new HashSet<>();
		Employee1 e1=new Employee1(1,"Ravi",100,"IT");
		Employee1 e2=new Employee1(2,"Shyam",200,"HR");
		set.add(e1);
		set.add(e2);

		for(Employee1 e:set)
		e.displayDetails();;
	}

}
