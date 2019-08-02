package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
protected long length;
protected long width;

//constructor
    public Quadrilateral(long length,long width){
    this.width=width;
    this.length=length;
}

//methods:

    public long getLength() {
        return this.length;
    }

    public long getWidth() {
        return this.width;
    }

    public abstract void setWidth();


    public abstract void setLength();

//overrides
    @Override
    public double getPerimeter() {
    return this.width * 2+this.length*2;
    }
    @Override
    public double getArea(){
    return this.width * this.length;
    }






}
