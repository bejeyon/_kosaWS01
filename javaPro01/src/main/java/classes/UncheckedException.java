/*
HWJava20_02_Chap14Summary01_배재연.zip
*/

/* 대표적인 실행 예외 */

package classes;

class A {}
class B extends A {}

class UncheckedException {
	public static void main(String[] args) {
		// Unchecked Exception == RuntimeException(실행 예외)

		// 1. ArithmaticException
		try {
			System.out.println(3 / 0);	// java.lang.ArithmeticException: / by zero
		} catch (ArithmeticException e) {
			// TODO: handle exception
		}
		// 2. ClassCastException
		A a = new A();
		try {
			B b = (B)a;	// java.lang.ClassCastException: classes.A cannot be cast to classes.B			
		} catch (ClassCastException e) {
			// TODO: handle exception
		}

		// 3. ArrayIndexOutOfBoundsException
		int[] array = {1, 2, 3};
		try {
			System.out.println(array[3]);	// java.lang.ArrayIndexOutOfBoundsException: 3			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		}

		// 4. NumberFormatException
		try {
			int num = Integer.parseInt("10!");	// java.lang.NumberFormatException: For input string: "10!"			
		} catch (NumberFormatException e) {
			// TODO: handle exception
		}

		// 5. NullPointerException
		String str = null;
		try {
			System.out.println(str.charAt(2));	// java.lang.NullPointerException			
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
	}
}
