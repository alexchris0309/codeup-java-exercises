package shapes;

public class Rectangle {

    protected long length;
    protected long width;

    public  long getArea(){
        return length * width;

    }

    public long getPerimeter(){
        return  2 * length + 2 * width;


    }


//constructor
    public Rectangle(long width, long length){
        this.width=width;
        this.length=length;
    }
}
