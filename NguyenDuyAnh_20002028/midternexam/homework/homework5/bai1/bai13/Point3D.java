package midternexam.homework.homework5.bai1.bai13;

public class Point3D extends Point2D {
   private float z;

   public Point3D() {
      this(0.0f, 0.0f, 0.0f);
   }

   public Point3D(float x, float y, float z) {
      super(x, y);
      this.z = z;
   }

   public float getZ() {
      return this.z;
   }

   public void setZ(float z) {
      this.z = z;
   }

   public float[] getXYZ() {
      float xyz[] = new float[3];
      xyz[0] = super.getX();
      xyz[1] = super.getY();
      xyz[2] = this.z;
      return xyz;
   }

   public void setXYZ(float x, float y, float z) {
      super.setXY(x, y);
      setZ(z);
   }

   @Override
   public String toString() {
      return "(" + getX() + ", " + getY() + ", " + getZ() + ")";
   }

}
