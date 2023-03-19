package midternexam.lab.lab6.bai1;

public class DiscountRate {
   private final static double serviceDiscountPremium = 0.2;
   private final static double serviceDiscountGold = 0.15;
   private final static double serviceDiscountSilver = 0.1;
   private final static double productDiscountPremium = 0.1;
   private final static double productDiscountGold = 0.1;
   private final static double productDiscountSilver = 0.1;

   public static double getServiceDiscountRate(String type) {
      if (type == null) {
         return 0.0;
      }
      if (type == "Premium") {
         return serviceDiscountPremium;
      }
      if (type == "Gold") {
         return serviceDiscountGold;
      }
      return serviceDiscountSilver;
   }

   public static double getProductDiscountRate(String type) {
      if (type == null) {
         return 0.0;
      }
      if (type == "Premium") {
         return productDiscountPremium;
      }
      if (type == "Gold") {
         return productDiscountGold;
      }
      return productDiscountSilver;
   }
}
