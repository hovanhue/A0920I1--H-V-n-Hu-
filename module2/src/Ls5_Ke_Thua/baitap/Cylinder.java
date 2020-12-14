package Ls5_Ke_Thua.baitap;

public class Cylinder extends Circle{
    private double heigh;

    public double getHeigh() {
        return heigh;
    }

    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }

    public Cylinder() {
        this.radius=0;
        this.color="Blue";
        this.heigh=0;
    }

    public Cylinder(double radius,String color, double heigh) {
        super(radius,color);
        this.heigh=heigh;
    }

    public double volume(){
        return Math.PI*this.radius*this.heigh*2;
    }
@Override
    public String toString(){
        return "A cylinder has radius: "+getRadius() +" Heigh :"+getHeigh()+" and color: "+getColor()+" Volume :"+volume();
    }
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder();
        cylinder.setHeigh(10);
        cylinder.setRadius(2);
        cylinder.setColor("Black");
        System.out.println(cylinder.toString());
    }
}
