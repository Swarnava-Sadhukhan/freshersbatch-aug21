
public class InsertSB {

	public static void main(String[] args) {
		String s1="insert text";
		String s2="It is used to _ at the specified index postion";
		int index=s2.indexOf("_");
		StringBuilder sb=new StringBuilder(s2);
		sb.insert(index, s1);
		System.out.println("After insertion: "+sb);
	}
}
