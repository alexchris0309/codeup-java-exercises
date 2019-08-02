package shapes;

public class ShapesTest {

    public static void main(String[] args) {
//        Rectangle box1= new Rectangle(4,5);
//        Rectangle box2= new Square(5);
//
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

//        create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.

        Measurable myshape;
        Measurable myshape2;
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(6,9);

        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());


        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());


    }
}
