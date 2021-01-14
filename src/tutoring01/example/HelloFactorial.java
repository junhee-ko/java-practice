package tutoring01.example;

public class HelloFactorial {

  public static void main(String[] args) {
    System.out.println(factorial(3)); // 3! = 3*2*1

  }

  private static int factorial(int num) {
    if (num == 1) {
      return 1;
    } else {
      return num * (factorial(num - 1)); // 3 * factorial(2)
      // 2 * factorial(1)
      // 1
    }
  }

}
