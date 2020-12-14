package Ls5_Ke_Thua.baitap;

public class Point2D {
    protected float x;
    protected float y;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Point2D(){
        this.x =0.0f;
        this.y =0.0f;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float []a={getX(),getY()};
        return a;
    }
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return getXY()+"";
    }

    public static void main(String[] args) {

    }
}
