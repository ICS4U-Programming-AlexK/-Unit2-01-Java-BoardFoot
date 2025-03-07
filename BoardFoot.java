import java.util.Scanner;
/**
 * @author Alex Kapajika
 * @version 1.0
 * @since 2025-03-06
 */
public final class BoardFoot {
    /** Constant for the volume of a board foot in cubic inches. */
    private static final int LENGTH = 144;
    /**
     * Private constructor to prevent instantiation.
     * @exception IllegalStateException if instantiation is attempted
     */
    private BoardFoot() {
        throw new IllegalStateException("Utility class");
    }
    /**
     * The width of the wood in inches.
     * @param width
     * The height of the wood in inches.
     * @param height
     * The required length in inches.
     * @return this is the return arg.
     */
    public static double calculateBoardFoot(final double width, final double height) {
        return LENGTH / (width * height);
    }
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width, height;
        while (true) {
            try {
                System.out.print("Enter the width of the wood: ");
                width = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter the height of the wood: ");
                height = Double.parseDouble(scanner.nextLine());
                if (width > 0 && height > 0) {
                    double length = calculateBoardFoot(width, height);
                    System.out.printf("The length is: %.2f inches\n", length);
                    break;
                } else {
                    System.out.println("Invalid input");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
                System.out.println("the value cannot be a negative number.");
            }
        }
    }
}