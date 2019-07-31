package shapes;
import util.Input;

public class CircleApp {



    public static void main(String[] args){
        Input input2 = new Input();
        double radius = input2.getDouble();
        Circle circle2= new Circle(radius);
        System.out.println("the area is: "+circle2.getArea());
        System.out.println("the circumference is: "+circle2.getCircumference());


    }
}
