package midternexam.homework.homework4.bai11;

public class MyComplex {
   private double real;
   private double img;

   public MyComplex() {
      this.real = 0.0;
      this.img = 0.0;
   }

   public MyComplex(double real, double img) {
      this.real = real;
      this.img = img;
   }

   public double getReal() {
      return this.real;
   }

   public void setReal(double real) {
      this.real = real;
   }

   public double getImg() {
      return this.img;
   }

   public void setImg(double img) {
      this.img = img;
   }

   public void setValue(double real, double img) {
      this.real = real;
      this.img = img;
   }

   @Override
   public String toString() {
      if (this.img >= 0) {
         return this.real + " + " + this.img + "i";
      }
      return this.real + " - " + (-this.img) + "i";

   }

   public boolean isReal() {
      if (this.img == 0) {
         return true;
      }
      return false;
   }

   public boolean isImaginary() {
      if (this.real == 0) {
         return true;
      }
      return false;
   }

   public boolean isEqual(double real, double img) {
      if (this.real == real && this.img == img) {
         return true;
      }
      return false;
   }

   public boolean isEqual(MyComplex anotherComplex) {
      if (this.real == anotherComplex.getReal() && this.img == anotherComplex.getImg()) {
         return true;
      }
      return false;
   }

   public double arguments() {
      return Math.atan2(this.img, this.real);
   }

   public double magnitude() {
      return Math.sqrt(this.real * this.real + this.img * this.img);
   }

   public MyComplex addInto(MyComplex addingValue) {
      this.real += addingValue.getReal();
      this.img += addingValue.getImg();
      return this;
   }

   public MyComplex addNew(MyComplex addingValue) {
      return new MyComplex(this.real + addingValue.getReal(), this.img + addingValue.getImg());
   }

   public MyComplex subtract(MyComplex subtractingValue) {
      this.real -= subtractingValue.getReal();
      this.img -= subtractingValue.getImg();
      return this;
   }

   public MyComplex subtractNew(MyComplex subtractingValue) {
      return new MyComplex(this.real - subtractingValue.getReal(), this.img - subtractingValue.getImg());
   }

   public MyComplex multiply(MyComplex multiplyingValue) {
      double oldReal = this.real;
      this.real *= multiplyingValue.getReal();
      this.real -= this.img * multiplyingValue.getImg();
      this.img *= multiplyingValue.getReal();
      this.img += oldReal * multiplyingValue.getImg();

      return this;
   }

   public MyComplex divde(MyComplex dividingValue) {
      dividingValue.setImg(-dividingValue.getImg());
      multiply(dividingValue);
      this.real /= Math.pow(dividingValue.magnitude(), 2);
      this.img /= Math.pow(dividingValue.magnitude(), 2);
      return this;
   }

   public MyComplex conjugate() {
      this.img = -this.img;
      return this;
   }

}
