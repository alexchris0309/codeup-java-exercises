package shapes;
import util.Input;

public class CircleApp {



    public static void main(String[] args){
        Input input2 = new Input();
        Circle circle2= new Circle(input2.getDouble());
        System.out.println(circle2.getArea());
        System.out.println(circle2.getCircumference());


    }
}
