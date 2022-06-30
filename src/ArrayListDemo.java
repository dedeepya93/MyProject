import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] allCodes = {"111", "222" ,"333","444", "555"};
		String[] assignedCodes = { "222" ,"333"};
		String[] unAssignedCodes = getUnassignedCodes(allCodes,assignedCodes);
		System.out.println(Arrays.toString(unAssignedCodes));
	}
	
	static String[] getUnassignedCodes(String[] allCodes,String[] assignedCodes){
		List<String> List1 = new ArrayList<String>(Arrays.asList(allCodes));		
		List<String> List2 = new ArrayList<String>(Arrays.asList(assignedCodes));
		
		List1.removeAll(List2);
		
		return List1.toArray(new String[List1.size()]);
		
	}

}
