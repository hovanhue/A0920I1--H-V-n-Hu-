package Ls5_Ke_Thua.baitap;

public class MoveablePoint extends Point2D {

    private float speedX;
    private float speedY;

    public MoveablePoint(){

    }

    public MoveablePoint(float speedX, float speedY) {
        this.speedX = speedX;
        this.speedY = speedY;
    }

    public MoveablePoint(float x, float y, float speedX, float speedY) {
        super(x, y);
        this.speedX = speedX;
        this.speedY = speedY;
    }

    public float getSpeedX() {
        return speedX;
    }

    public void setSpeedX(float speedX) {
        this.speedX = speedX;
    }

    public float getSpeedY() {
        return speedY;
    }

    public void setSpeedY(float speedY) {
        this.speedY = speedY;
    }

    public void setSpeed(float x, float y){
        setSpeedX(x);
        setSpeedY(y);
    }

    public float[] getSpeed(){
        float a[]={getSpeedX(),getSpeedY()};
        return a;
    }
@Override
    public String toString(){
        return super.toString()+" "+this.getSpeedX()+" "+this.getSpeedY();
    }

    public MoveablePoint move(){
        x+=getSpeedX();
        y+=getSpeedY();
        return this;
    }

    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(3,4,5,6);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
