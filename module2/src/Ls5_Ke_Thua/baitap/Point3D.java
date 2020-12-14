package Ls5_Ke_Thua.baitap;

public class Point3D extends Point2D {
    private float z;

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public Point3D(){
        super();
        this.z=0.0f;
    }

    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }
    public String toString(){
        return super.toString()+""+getZ();
    }

    public static void main(String[] args) {
        
    }
}
