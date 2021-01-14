package tutoring01.practice;

import java.util.Scanner;

public class ThreeNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("정수 3개 입력: ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
    int max = 0;

    if (num1 > num2 && num1 > num3) {
      max = num1;
    } else if (num2 > num1 && num2 > num3) {
      max = num2;
    } else if (num3 > num1 && num3 > num2) {
      max = num3;
    }

    System.out.println(max);
  }

}
