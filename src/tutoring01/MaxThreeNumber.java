package tutoring01;

public class MaxThreeNumber {

  public static void main(String[] args) {

  }

  public static int max(int a, int b, int c) {

    int max = (a < b) ? b : a;
    max = (c < max) ? max : c;
    return max;
  }
}
