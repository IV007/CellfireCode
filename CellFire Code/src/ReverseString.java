/*Simple java function to reverse a string 
 * 
 * */

import java.util.Scanner;

public class ReverseString {



	public static void main(String[] args) {
		String original;
		String reversed = "";
		Scanner in = new Scanner(System.in);

		System.out.println("Enter any String: \n");
		original = in.nextLine();

		int length = original.length();
		for(int i = length-1; i >= 0; i--){
			reversed += original.charAt(i); 
		}

		System.out.println ("Reversed String is: " +reversed);
	}

}
