package abstracz;

public abstract class Shape {
    abstract void draw();

    public static void main(String[] args) {
        Shape[] shape = {new Rectangle(), new Triangle()};
        for (Shape shape1 : shape) {
            shape1.draw();
        }
    }
    static class Rectangle extends Shape {
        @Override
        void draw() {
            System.out.println("Shape is : " + Rectangle.class.getSimpleName());
        }
    }

    static class Triangle extends Shape {

        @Override
        void draw() {
            System.out.println("Shape is : " + Triangle.class.getSimpleName());
        }
    }
}
