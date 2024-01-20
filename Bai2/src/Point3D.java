public class Point3D extends Point2D {
    private float z;

    //tạo đối tượng mới
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    //getter.
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    //
    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }
    public float[] getXYZ() {
        return new float[] { getX(), getY(), z };
    }


    public String toString() {
        return super.toString() + "," + z;
    }
}
//       +-----------------+
//       |    Point2D     |
//       +-----------------+
//       | - x: float  = 0.0f    |
//       | - y: float  = 0.0f    |
//       +-----------------+
//       |+Point 2D (x:float, y:float)
//       | +Point 2D ()
//       |+ getX(): float |
//       | + getY(): float |
//       | + setX(x: float) void |
//       | + setY(y: float) void |
//       | setXY( x:float,y :float):void
//       |getXY ():float[2] -----------Array of {x,y}
//       | toString() :String ----------"(x,y)"
//       +-----------------+
//               ^
//               |
//     extends   |
//             +----------------+
//             |    Point3D    |
//             +----------------+
//             | - z: float =0.0f|
//             +----------------+
//             |+Point 3D(x:float,y :float,z:float)
//             |+ +Point 3D
//             |+ getZ(): float |
//             | + setZ(z: float): void|
//             |setXY( x:float,y :float,z:float):void
//             |getXY ():float[3] -----------Array of {x,y,z}
//             | toString():String------------"x,y,z"
//             +----------------+
//