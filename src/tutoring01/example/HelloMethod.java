package tutoring01.example;

public class HelloMethod {

  public static void main(String[] args) {
    System.out.println("Before Method");
    MyReturn();
    System.out.println("After Method");
  }

  private static void MyReturn() {
    for (int i = 0; i < 10; i++) {
      if (i == 5) {
        return;
      } else {
        System.out.println(i);
      }
    }
  }
}
