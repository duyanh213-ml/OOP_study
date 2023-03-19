package midternexam.homework.homework4.bai14;

public class MyTime {
   private int hour;
   private int minute;
   private int second;

   public MyTime() {
      this(0, 0, 0);
   }

   public MyTime(int hour, int minute, int second) {
      if (second < 0 || second > 59 || minute < 0 || minute > 59 || hour < 0 || hour > 23) {
         this.hour = 0;
         this.minute = 0;
         this.second = 0;
      }
      this.hour = hour;
      this.minute = minute;
      this.second = second;
   }

   public int getHour() {
      return this.hour;
   }

   public void setHour(int hour) {
      if (hour < 0 || hour > 23) {
         return;
      }
      this.hour = hour;
   }

   public int getMinute() {
      return this.minute;
   }

   public void setMinute(int minute) {
      if (minute < 0 || minute > 59) {
         return;
      }
      this.minute = minute;
   }

   public int getSecond() {
      return this.second;
   }

   public void setSecond(int second) {
      if (second < 0 || second > 59) {
         return;
      }
      this.second = second;
   }

   public void setTime(int hour, int minute, int second) {
      if (second < 0 || second > 59 || minute < 0 || minute > 59 || hour < 0 || hour > 23) {
         return;
      }
      this.hour = hour;
      this.minute = minute;
      this.second = second;
   }

   @Override
   public String toString() {
      String hour = String.valueOf(this.hour);
      String minute = String.valueOf(this.minute);
      String second = String.valueOf(this.second);
      if (this.hour < 10) {
         hour = "0" + this.hour;
      }
      if (this.minute < 10) {
         minute = "0" + this.minute;
      }
      if (this.second < 10) {
         second = "0" + this.second;
      }

      return hour + ":" + minute + ":" + second;
   }

   public MyTime nextSecond() {
      if (this.hour == 23 && this.minute == 59 && this.second == 59) {
         this.hour = 0;
         this.minute = 0;
         this.second = 0;
         return this;
      }
      if (this.minute == 59 && this.second == 59) {
         this.hour++;
         this.minute = 0;
         this.second = 0;
         return this;

      }
      if (this.second == 59) {
         this.minute++;
         this.second = 0;
         return this;
      }
      this.second++;
      return this;
   }

   public MyTime nextMinute() {
      if (this.hour == 23 && this.minute == 59) {
         this.hour = 0;
         this.minute = 0;
         return this;
      }
      if (this.minute == 59) {
         this.hour++;
         this.minute = 0;
         return this;

      }
      this.minute++;
      return this;
   }

   public MyTime nextHour() {
      if (this.hour == 23) {
         this.hour = 0;
         return this;
      }
      this.hour++;
      return this;
   }

   public MyTime previousSecond() {
      if (this.hour == 0 && this.minute == 0 && this.second == 0) {
         this.hour = 23;
         this.minute = 59;
         this.second = 59;
         return new MyTime(hour, minute, second);
      }
      if (this.minute == 0 && this.second == 0) {
         this.hour--;
         this.minute = 59;
         this.second = 59;
         return new MyTime(hour, minute, second);

      }
      if (this.second == 0) {
         this.minute--;
         this.second = 59;
         return new MyTime(hour, minute, second);

      }
      this.second--;
      return new MyTime(hour, minute, second);

   }

   public MyTime previousMinute() {
      if (this.hour == 0 && this.minute == 0) {
         this.hour = 23;
         this.minute = 59;
         return this;
      }
      if (this.minute == 0) {
         this.hour--;
         this.minute = 59;
         return this;

      }
      this.minute--;
      return this;
   }

   public MyTime previousHour() {
      if (this.hour == 0) {
         this.hour = 23;
         return this;
      }
      this.hour--;
      return this;
   }

}
