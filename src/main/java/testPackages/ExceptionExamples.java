//package testPackages;
//
//import java.security.PublicKey;
//
//import org.checkerframework.common.value.qual.StaticallyExecutable;
//
//public class ExceptionExamples {
//
//	public static void main(String[] args) throws Exception {
//		
//		//System.out.println(getResult(2,5));
//		//System.out.println((double)2/5);
//		//System.out.println(2/5);
//	
//
//		String aString = "New York";
//	    getStringValue(aString, 4);
//	}
//	
//	public static int getResult(int a, int b) {
//		return 0;
//	}{
//		int result = 0;
//		try {
//			if(a > b) {
//				result = a/b;
//			}else {
//				result = b/a;
//			}}
//			catch (ArithmeticException e) {
//				System.out.println("Arithmatic Exception occurs");
//			}
//	
//		}
//
//	public static void getStringValue(String input, int index) {
//		try {
//			System.out.println(input.charAt(index));
//		} catch (StringIndexOutOfBoundsException e) {
//			System.out.println("It is out of bound");
//		}
//	}
//}
