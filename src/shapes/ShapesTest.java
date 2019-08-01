package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle box1= new Rectangle(4,5);
        Square box2= new Square(5);

        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());

//        create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.

    }
}
