package ch7;

public class PointTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D.getLocation());
    }
}

class Point{
    int x=1,y=2;

    String getLocation(){
        return "x : "+x+", y : "+y;
    }
}

class Point3D extends Point{
    int z=3;

    String getLocation(){
        return super.getLocation()+", z : "+z;
    }
}