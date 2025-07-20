import java.util.*;

public class BinaryRepresentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number between 1 and 255: ");
        int number = sc.nextInt();

        if (number < 1 || number > 255) {
            System.out.println("Number out of range! Please enter a number between 1 and 255.");
        } else {
            String binaryString = Integer.toBinaryString(number);
            String paddedBinary = String.format("%8s", binaryString).replace(' ', '0');
            System.out.println(paddedBinary);
        }
        
        
    }
}