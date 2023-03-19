package midternexam.homework.homework4.bai15;

public class MyDate {
   private int day;
   private int month;
   private int year;
   public static final String[] MONTHS = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
         "Dec" };
   public static final String[] DAYS = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
   public static final int[] DAYSINMONTH = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

   public MyDate(int day, int month, int year) {
      if (!isValidDate(year, month, day)) {
         return;
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
         if (!isLeapYear(year) && day == 29) {
            return;
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
      if (year < 1582 || year > 9999) { // we calculate calendar from 1582
         return;
      }
      this.year = year;
   }

   public void setDate(int day, int month, int year) {
      if (isValidDate(year, month, day)) {
         this.year = year;
         this.month = month;
         this.day = day;
      }

   }

   @Override
   public String toString() {
      String formatDay = String.valueOf(this.day);

      if (this.day < 10) {
         formatDay = "0" + this.day;
      }

      return DAYS[getDayOfWeek(this.year, this.month, this.day)] + " " + formatDay + " " + MONTHS[this.month - 1] + " "
            + this.year;
   }

   public static boolean isLeapYear(int year) {
      if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
         return true;
      }
      return false;
   }

   public static boolean isValidDate(int year, int month, int day) {
      if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1999 || year > 9999) {
         return false;
      }

      if (month == 4 || month == 6 || month == 9 || month == 11) {
         if (day == 31) {
            return false;
         }
      }

      if (month == 2) {
         if (!isLeapYear(year) && day == 29) {
            return false;
         }
      }
      return true;
   }

   public static int getDayOfWeek(int year, int month, int day) {
      // formula on the internet
      int a = (14 - month) / 12;
      int y = year - a;
      int m = month + 12 * a - 2;
      return (day + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;

   }

   public MyDate nextDay() {
      if (this.month == 12 && this.day == 31) {
         this.month = 1;
         this.day = 1;
         this.year++;
         return this;
      }
      if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
         if (this.day == 30) {
            this.month++;
            this.day = 1;
            return this;
         }
      }
      if (this.month == 2) {
         if (this.day == 28 && !isLeapYear(year)) {
            this.month = 3;
            this.day = 1;
            return this;
         }
         if (this.day == 29 && isLeapYear(year)) {
            this.month = 3;
            this.day = 1;
            return this;
         }

      }
      if (this.day == 31) {
         this.day = 1;
         this.month++;
         return this;
      }
      this.day++;
      return this;
   }

   public MyDate nextMonth() {
      if (this.month == 12) {
         this.month = 1;
         this.year++;
         return this;
      }
      if (this.month == 3 || this.month == 5 || this.month == 8 || this.month == 10) {
         if (this.day == 31) {
            this.month++;
            this.day -= 1;
            return this;
         }
      }
      if (this.month == 1) {
         if (this.day == 30 || this.day == 31) {
            this.month = 2;
            this.day = 28;
            return this;
         }

      }
      this.month++;
      return this;
   }

   public MyDate nextYear() {
      if (this.month == 9999) {
         this.year = 1582;
         return this;
      }

      this.year++;
      return this;
   }

   public MyDate PreviousDay() {
      if (this.month == 1 && this.day == 1) {
         this.month = 2;
         this.day = 31;
         this.year--;
         return this;
      }
      if (this.month == 5 || this.month == 7 || this.month == 10 || this.month == 12) {
         if (this.day == 1) {
            this.month--;
            this.day = 30;
            return this;
         }
      }
      if (this.month == 3) {
         if (this.day == 1 && !isLeapYear(year)) {
            this.month = 2;
            this.day = 28;
            return this;
         }
         if (this.day == 1 && isLeapYear(year)) {
            this.month = 2;
            this.day = 29;
            return this;
         }

      }
      if (this.day == 1) {
         this.day = 31;
         this.month--;
         return this;
      }
      this.day++;
      return this;
   }

   public MyDate previousMonth() {
      if (this.month == 1) {
         this.month = 12;
         this.year--;
         return this;
      }
      if (this.month == 5 || this.month == 7 || this.month == 10 || this.month == 12) {
         if (this.day == 31) {
            this.month--;
            this.day -= 1;
            return this;
         }
      }
      if (this.month == 3) {
         if (this.day == 30 || this.day == 31) {
            this.month = 2;
            this.day = 28;
            return this;
         }

      }
      this.month--;
      return this;
   }

   public MyDate previousYear() {
      if (this.month == 1582) {
         this.year = 9999;
         return this;
      }

      this.year--;
      return this;
   }

}
