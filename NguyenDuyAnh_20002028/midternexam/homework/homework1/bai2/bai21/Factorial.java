package midternexam.homework.homework1.bai2.bai21;

import java.util.Scanner;

public class Factorial {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      int n = 20;
      int factorial = 1;

      for (int i = 1; i <= n; i++) {
         factorial *= i;
      }

      System.out.println(factorial);

      // Lỗi sai (bug) của chương trình trên sau khi debug:
      // Sau khi i chạy đến giá trị 18, giá trị của 18! lớn hơn giá trị
      // lớn nhất của kiểu integer, dẫn đến tràn số
      // do đó kết quả sẽ không còn đúng.
      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
