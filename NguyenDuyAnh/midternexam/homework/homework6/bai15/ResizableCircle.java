package midternexam.homework.homework6.bai15;

public class ResizableCircle extends Circle implements Resizable{
   public ResizableCircle(double radius) {
      super(radius);
   }

   @Override
   public String toString() {
      return "ResizableCircle[" + super.toString() + "]";
   }

   public void resize(int percent) {
      super.radius *= percent / 100.0;
   }

}
