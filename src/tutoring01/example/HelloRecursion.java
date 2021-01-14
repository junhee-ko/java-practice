package tutoring01.example;

public class HelloRecursion {

  public static void main(String[] args) {
    int result = factorial(10);
    System.out.println(result);
  }

  private static int factorial(int num) {
    if (num == 1) {
      return 1;
    } else {
      return num * (factorial(num - 1));
    }
  }
}
