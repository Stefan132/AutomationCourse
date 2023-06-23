package ro.sit.course.course03;

public class Square {
    private double squareSide;
//    final double FIXED_SQUARE_SIDE;

    public Square(double squareSide) {
        this.squareSide =squareSide;
    }

//    public Square(double FIXED_SQUARE_SIDE) {
//        this.FIXED_SQUARE_SIDE = FIXED_SQUARE_SIDE;
//    }

    public Square() {

    }
    double getArea() {
        return squareSide * squareSide;
    }
      void setSquareSide(double squareSide){
          this.squareSide = squareSide;
      }
}
