public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        circle.setColor("green");
        circle.setFilled(true);
        circle.setRadius(4.0);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        System.out.println(circle.getColor());
        System.out.println(circle.isFilled());
        Circle circle1 = new Circle("blue", false,7.0);
        System.out.println(circle1);
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(7.5);
        rectangle.setWidth(2.5);
        rectangle.setColor("orange");
        rectangle.setFilled(true);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getColor());
        System.out.println(rectangle.isFilled());
        Rectangle rectangle1 = new Rectangle("grey", true, 4.0, 12.5);
        System.out.println(rectangle1);
        Square square = new Square();
        square.setColor("pink");
        square.setFilled(false);
        square.setSide(5.5);
        System.out.println(square.getSide());
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println(square.getColor());
        System.out.println(square.isFilled());
        Square square1 = new Square("yellow", true, 4.0);
        System.out.println(square1);



    }
}
