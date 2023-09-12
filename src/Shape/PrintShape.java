package Shape;

public class PrintShape {
    public void printShape(Shape shape) {
        shape.printName();
    }

    public static void main(String[] args) {

      PrintShape printShape = new PrintShape();
      printShape.printShape(new Circle());
      printShape.printShape(new Oval());
      printShape.printShape(new Square());
      printShape.printShape(new Trapezium());
      printShape.printShape(new Triangle());
    }
}
