public class Square  extends Rectangle{
 

    private double side;

    public Square (double side){
        super (side, side);
        this.side = side;}

    
    public double getSide() {
        return side;
    }
    
    public void setSide(double side) {
        this.side = side;
        super.setWidth(side);
        super.setLength(side);
    }
    @Override public void setWidth (double side ) {
        this.side = side;
        super.setWidth(side);
    }

    @Override public void setLength (double side){
    this.side = side;
    super.setLength(side);
    }

    @Override
    public String toString () {
        return super.toString() + " A Square with side  = " + side + ", which is a subclass of width = " + width +  "length" + length;}

}
