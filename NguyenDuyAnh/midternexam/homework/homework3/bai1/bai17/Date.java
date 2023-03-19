package midternexam.homework.homework3.bai1.bai17;

public class Date {
   private int day;
   private int month;
   private int year;

   public Date(int day, int month, int year) {
      if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1999 || year > 9999) {
         return;
      }

      if (month == 4 || month == 6 || month == 9 || month == 11) {
         if (day == 31) {
            return;
         }
      }

      if (month == 2) {
         if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            if (day > 29) {
               return;
            }
         } else {
            if (day > 28) {
               return;
            }
         }
      }

      this.day = day;
      this.month = month;
      this.year = year;
   }

   public int getDay() {
      return this.day;
   }

   public void setDay(int day) {
      if (day < 1 || day > 31) {
         return;
      }

      if (month == 4 || month == 6 || month == 9 || month == 11) {
         if (day == 31) {
            return;
         }
      }

      if (month == 2) {
         if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            if (day > 29) {
               return;
            }
         } else {
            if (day > 28) {
               return;
            }
         }
      }
      this.day = day;
   }

   public int getMonth() {
      return this.month;
   }

   public void setMonth(int month) {
      if (month < 1 || month > 12) {
         return;
      }
      this.month = month;
   }

   public int getYear() {
      return this.year;
   }

   public void setYear(int year) {
      if (year < 1999 || year > 9999) {
         return;
      }
      this.year = year;
   }

   public void setDate(int day, int month, int year) {
      if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1999 || year > 9999) {
         return;
      }

      if (month == 4 || month == 6 || month == 9 || month == 11) {
         if (day == 31) {
            return;
         }
      }

      if (month == 2) {
         if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            if (day > 29) {
               return;
            }
         } else {
            if (day > 28) {
               return;
            }
         }
      }

      this.day = day;
      this.month = month;
      this.year = year;
   }

   @Override
   public String toString() {
      String day = String.valueOf(this.day);
      String month = String.valueOf(this.month);
      String year = String.valueOf(this.year);
      if (this.day < 10) {
         day = "0" + this.day;
      }
      if (this.month < 10) {
         month = "0" + this.month;
      }
      return day + "/" + month + "/" + year;
   }

}
