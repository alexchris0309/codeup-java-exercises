package shapes;

public class Square extends Rectangle{
    protected long side;

//    should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.
    public  Square(int side){

        super(side,side);
        this.side=side;

    }

//    override getarea getperimeter
public  long getArea(){
    return this.side * this.side;

}
    public long getPerimeter(){
        return this.side * 4;


    }

}
