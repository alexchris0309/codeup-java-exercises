package shapes;

public class Circle {
    private double radius;


    public double getArea(){ return 2*Math.PI*(radius*radius);

    }

    public  double getCircumference(){
        return  2*Math.PI*radius;    }


//        constructor
    public Circle(double radius){
        this.radius=radius;
    }


}
