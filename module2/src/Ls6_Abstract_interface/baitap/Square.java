package Ls6_Abstract_interface.baitap;

public class Square  extends Rectangle implements Resizeable{

    public Square(){
        super();
    }
    public Square(double side ){
        super(side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
    public static void main(String[] args) {
        Square square = new Square(1);
        square.setSide(10);

        System.out.println(square.toString());
        System.out.println("Diện tích: "+square.getArea());
        System.out.println("Chu vi: "+square.getPerimetor());
    }

    @Override
    public void resize(double percent) {
       this.length += this.length*(percent/100);
    }
}
