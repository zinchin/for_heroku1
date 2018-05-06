import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		String s1 = "ABRAKADABRA";
		//System.out.println(s1.charAt(5));
		
		/*int sl = s1.length();
		for (int i=0; i<sl; i++){
			System.out.println(s1.charAt(i));
		}*/
		
		//System.out.println(uncesar(cesar("KISSHIMNOW", 10),10));
		System.out.println(s1.substring(6,9));
		System.out.println(toTitleCase(s1));
		System.out.println(s1.contains("KAD"));
		System.out.println(s1.indexOf("ABRA",3));
		
		System.out.println(Arrays.toString(allIndexes(s1,"Z")));

	}
	
	public static String cesar(String msg, int key){
		String res = "";
		int sl = msg.length();
		for (int i=0; i<sl; i++)
			res = res + (char)('A'+(msg.charAt(i) + key - 'A')%26);
		return res;
	}
	
	public static String uncesar(String msg, int key){
		String res = "";
		int sl = msg.length();
		for (int i=0; i<sl; i++)
			res = res + (char)('A'+(msg.charAt(i) + (26-key) - 'A')%26);
		return res;
	}
	
	public static String toTitleCase(String s){
		return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
	}
	
	public static int[] allIndexes(String str, String pattern){
		int[] buffer = new int[str.length()];
		int counter = 0;
		int index;
		int found = 0;
		while(true){
			index = str.indexOf(pattern, found);
			if (index < 0)break;
			buffer[counter]=index;
			counter++;
			found = index + 1;
		}
		int[] res = new int[counter];
		for (int i=0; i<counter; i++)res[i]=buffer[i];
		return res;
	}

}
