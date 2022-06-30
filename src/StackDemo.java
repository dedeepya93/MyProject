import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// check if opening/closing braces in the given string are balanced or not
		
		String S1 = "{ [ (  hteh ) ] }";     		//adding characters in between also works
		String S2 = "{ } fbsf [ ] ( )";
		String S3 = "{ [  dh } ) ] )";
		String S4 = "{ } [ ] ( ";
		
		System.out.println(isBalanced(S1));
		System.out.println(isBalanced(S2));
		System.out.println(isBalanced(S3));
		System.out.println(isBalanced(S4));
		
	}
	static boolean isBalanced(String S)
	{
		char[] sChar=S.toCharArray();
		Stack<Character> stack = new Stack();
		
		for(char c: sChar){
			if(c=='{' || c=='[' || c=='('){
				stack.push(c);
			}
			else if(c== '}') {
				if(!(stack.pop()=='{')){			//order also matters
					return false;
				}	
			}
			else if(c== ']') {
				if(!(stack.pop()=='[')){
					return false;
				}	
			}
			else if(c== ')') {
				if(!(stack.pop()=='(')){
					return false;
				}	
			}
		}
		if(stack.empty()==false){            //!(stack.empty())
			return false;
		}
		return true;
		
	}

}
