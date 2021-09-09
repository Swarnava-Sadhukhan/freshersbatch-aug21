
public class ReverseSB {

	public static void main(String[] args) {
		String str="This method returns the reversed object on which it was called";
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		System.out.println(sb);
	}
}
