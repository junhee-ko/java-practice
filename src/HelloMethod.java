public class HelloMethod {

  public static void main(String[] args) {
    System.out.println("Before Method");
    helloReturn();
    System.out.println("After Method");
  }

  private static void helloReturn() {
    for (int i = 0; i < 10; i++) {
      if (i == 5) {
        return;
      } else {
        System.out.println(i);
      }
    }

  }
}
