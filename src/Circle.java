public class Circle extends Shape {
    private double radius;

    public Circle (){
        double radius = 1.0;

    }
     public Circle(String color, boolean filled, double radius){
        super(color,filled);
        this.radius = radius;
     }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + " Color: " + getColor() +
                " Is filled: " + isFilled() + " Area: " + getArea() + " Perimiter: " +
                getPerimeter() +
                '}';
    }

    @Override
    public double getArea() {
        double area = 3.14 *(radius * radius);
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = radius * (2 * 3.14);
        return perimeter;
    }


}
