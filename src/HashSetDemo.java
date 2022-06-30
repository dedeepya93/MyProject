import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// get position of all duplicates in the string and total number of duplicates
		String S="hello world";
		char[] sChar=S.toCharArray();
		Set<Character> set=new HashSet<Character>();
		
		int counter=0;
		for(int i=0;i<sChar.length;i++){
			if(!(set.add(sChar[i]))){
				System.out.println("Duplicate character index is " +i +"and character is" +sChar[i]);
				counter++;
			}
		}
		System.out.println("Total duplicate characters are "+counter);
	}

}
