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
    public static float calculateBoardFoot(final float width,
     final float height) {
        return LENGTH / (width * height);
    }
    /**
     * @param args
     */
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Prompt the user to enter the width and height of the wood.
            System.out.print("Enter the width of the wood: ");
            float width = Float.parseFloat(scanner.nextLine());
            System.out.print("Enter the height of the wood: ");
            float height = Float.parseFloat(scanner.nextLine());
            // Calculate the length of the wood.
            if (width <= 0 && height <= 0) {
                // the value cannot be a negative number.
                System.out.println("Invalid input");
            } else {
                float length = calculateBoardFoot(width, height);
                // Display the length of the wood.
                System.out.printf("The length is: %.2f inches\n", length);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
            System.out.println("the value cannot be a negative number.");
        }
    }
}
