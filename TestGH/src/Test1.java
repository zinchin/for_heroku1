import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		
		String s1 = "abrakadabra";
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		
		String s2 = "     \t  sasha   \n";
		System.out.println(s2.length());
		String s3 = s2.trim();
		System.out.println(s3.length());
		
		char[] carr = s2.toCharArray();
		System.out.println(Arrays.toString(carr));
		
		String s4 = "WARNING!";
		System.out.println(s4.toLowerCase());
		System.out.println(s4);
		
		String s5 = " eXId  ";
		System.out.println(s5.trim().toLowerCase().equals("exit"));
	}
}
