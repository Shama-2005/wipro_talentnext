import java.util.*;

public class BinaryOctal {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the nummber");
			int number = sc.nextInt();
			System.out.println("Given Number :" + number);
			System.out.println("Binary equivalent :" + Integer.toBinaryString(number));
			System.out.println("Octal equivalent :" + Integer.toOctalString(number));
			System.out.println("Hexadecimal equivalent :" + Integer.toHexString(number));
		} catch (NumberFormatException e) {
			System.out.println("Invalid number format. Please enter a valid integer.");
		}
	}

}