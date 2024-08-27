package classwork.lesson16;

public class AbstractAreas {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(9, 5);
        Triangle triangle = new Triangle(10, 8);
        Figure figref;
        figref = rectangle;
        System.out.println("Плoщaдь равна " + figref.area() + "\n");
        figref = triangle;
        System.out.println("Плoщaдь равна " + figref.area() + "\n");
        System.out.println("Плoщaдь равна " + triangle.area() + "\n");
        System.out.print("Плoщaдь равна " + rectangle.area());
    }
}
