package ch7;

public class PointTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(1,2,3);
        System.out.println(point3D.getLocation());
    }
}

class Point{
    int x,y;

    Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    String getLocation(){
        return "x : "+x+", y : "+y;
    }
}

class Point3D extends Point{
    int z;

    Point3D(int x,int y,int z){
        super(x,y);
        this.z=z;
    }

    String getLocation(){
        return super.getLocation()+", z : "+z;
    }
}