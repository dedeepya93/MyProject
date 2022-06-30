package Practice;
public class MainMethodOverload2 extends mainOverloading
{  
//original main() method  
public static void main(String args[])  
{  
	MainMethodOverload2 mmo= new MainMethodOverload2 ();  
//calling overloaded main() method from the original main() method  
mmo.main();
mmo.testStaticKeyword();
}
//public void testStaticKeyword()
//{
//	System.out.println("Inside static method in  child class");
//}
}