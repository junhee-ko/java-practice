package prac;

public class RecursionSum {

  public static void main(String[] args) {
    System.out.println(sum(10));

  }

  public static int sum(final int n) {
    if (n > 0) {
      return n + sum(n - 1);
    } else {
      return n;
    }
  }
}
