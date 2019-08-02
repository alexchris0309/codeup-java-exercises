package shapes;

public class Square extends Quadrilateral{

//    constructor
    public Square(long side){
        super(side,side);
    }


    @Override
    public void setWidth() {

    }

    @Override
    public void setLength() {

    }

    @Override
        public double getArea(){
            return 2 * this.length;
        }
    @Override
        public double getPerimeter(){
        return 4 * this.length;
    }


}
