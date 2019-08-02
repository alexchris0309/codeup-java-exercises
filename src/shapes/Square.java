package shapes;

public class Square extends Rectangle{

//    should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.
    public  Square(int side){

        super(side,side);

    }

//    override getarea getperimeter
public  long getArea(){
    return this.width * this.length;

}
    public long getPerimeter(){
        return this.width * 4;


    }

}
