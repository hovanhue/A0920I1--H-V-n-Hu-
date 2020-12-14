package Ls5_Ke_Thua.thuchanh;

public class Shape {
    protected String color;
    protected boolean filled;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getFilled() {
        return true;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Shape() {
        this.color = "Green";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    @Override
    public String toString() {
        return "A Shape with color of " + getColor() + " and "+(getFilled() ? "filled" : "not filled");
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.setColor("Blue");
        shape.setFilled(true);
        System.out.println(shape.toString());
    }
}
