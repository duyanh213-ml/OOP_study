package midternexam.homework.homework4.bai12;


public class MyPolynomial {
   private double[] coeffs;

   public MyPolynomial(double... coeffs) {
      this.coeffs = coeffs;
   }

   public int getDegree() {
      return coeffs.length - 1;
   }

   @Override
   public String toString() {
      String poly = "";
      for (int i = coeffs.length - 1; i > 1; i--) {
         poly += coeffs[i] + "x^" + i + " + ";
      }
      poly += coeffs[1] + "x" + " + " + coeffs[0];
      return poly;
   }

   public double evaluate(double x) {
      double result = 0.0;
      for (int i = coeffs.length - 1; i >= 0; i--) {
         result += coeffs[i] * Math.pow(x, i);
      }
      return result;
   }

   public MyPolynomial add(MyPolynomial right) {
      double newCoeffs[];
      if (right.getDegree() >= this.getDegree()) {
         newCoeffs = new double[right.getDegree() + 1];
         for (int i = 0; i <= this.getDegree(); i++) {
            newCoeffs[i] += this.getDegree();
         }
         return new MyPolynomial(newCoeffs);
      }
      newCoeffs = new double[this.getDegree() + 1];
      for (int i = 0; i <= right.getDegree(); i++) {
         newCoeffs[i] += right.getDegree();
      }
      return new MyPolynomial(newCoeffs);

   }

   public MyPolynomial multiply(MyPolynomial right) {
      double newCoeff[] = new double[this.getDegree() + right.getDegree() + 1];
      for (int i = 0; i < newCoeff.length; i++) {
         newCoeff[i] = 0;
      }
      for (int i = this.getDegree(); i >= 0; i--) {
         for (int j = right.getDegree(); j >= 0; j--) {
            newCoeff[i + j] += right.coeffs[j] * this.coeffs[i];
         }
      }
      return new MyPolynomial(newCoeff);
   }

}
