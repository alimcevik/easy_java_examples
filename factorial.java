import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int num, factorial = 1;
    System.out.println("Faktöriyeli alınacak sayıyı girin: ");
    num = input.nextInt();

    for (int counter = 2; counter <= num; counter++) {
      factorial = factorial * counter;
    }

    System.out.println(num + "! = " + factorial);
  }
}