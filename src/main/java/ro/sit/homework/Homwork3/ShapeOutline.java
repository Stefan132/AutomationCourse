package ro.sit.homework.Homwork3;

public class ShapeOutline {
    public static void drawShapeOutline(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (row == 0 || row == height - 1 || col == 0 || col == width - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        drawShapeOutline(10, 4);
    }
}
