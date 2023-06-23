package ro.sit.homework.Homwork3;

public class FullShape {
    public static void drawFullShape(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Example usage
        drawFullShape(10, 4);
    }
}
