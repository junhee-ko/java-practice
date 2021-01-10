package prac;

public class Pivonachi {

  public static void main(String[] args) {
    System.out.println(fib(2));
  }

  public static int fib(final int n) {
    if (n > 2) {
      return fib(n - 2) + fib(n - 1);
    }

    return 1;
  }

}
