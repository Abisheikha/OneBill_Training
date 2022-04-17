package com.ob.day8exceptionhandling;

/**
* @author Abisheikha
*/
import java.util.*;

public class MultipleTryCatch {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Enter the first number");
			int number1 = scan.nextInt();
			System.out.println("Enter the second number");
			int number2 = scan.nextInt();
			int res;
			res = number1 / number2;
			int[] a;
			a = new int[res];
			System.out.println(a[4]);
			// System.out.println(a[3]);
//		} catch (ArrayIndexOutOfBoundsException e) {  // multiple catch statements
//			System.out.println("The index is out of range");
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Enter the denom>0");
//		}
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			if (e instanceof ArrayIndexOutOfBoundsException) {
				// e.printStackTrace();
				System.out.println("The index is out of range");
			}
			if (e instanceof ArithmeticException) {
				System.out.println("Enter the denom>0");
			}
		}
		System.out.println("program end");
	}
}
