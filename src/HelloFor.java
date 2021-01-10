public class HelloFor {

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }

    for (int i = 1; i <= 5; i++) {
      System.out.println("i : " + i);
      for (int j = 1; j <= 5; j++) {
        System.out.println(" j : " + j);
        System.out.println("  i * j : " +i * j);
      }
    }
  }
}
