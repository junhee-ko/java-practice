public class HelloOperator {

  public static void main(String[] args) {
    // 대입 연산자
    int num01 = 30;
    int num02 = 11;

    // 산술 연산자
    System.out.println("+ : " + (num01 + num02));
    System.out.println("- : " + (num01 - num02));
    System.out.println("* : " + num01 * num02);
    System.out.println("/ : " + num01 / num02);
    System.out.println("% : " + num01 % num02);

    // 복합 대입 연산자
    int num03 = 100;
    num03 += 10;
    num03 -= 10;
    num03 *= 16;
    num03 /= 3;
    num03 %= 1;
    System.out.println("num03 : " + num03);

    // 비교 연산
    int num04 = 12;
    int num05 = 120;
    System.out.println(num04 > num05);
    System.out.println(num04 < num05);
    System.out.println(num04 >= num05);
    System.out.println(num04 <= num05);
    System.out.println(num04 == num05);
    System.out.println(num04 != num05);

    // 논리 연산자자
    int num06 = 1;
    int num07 = 100;
    boolean bool = true;

    System.out.println(num06 < 10 && num07 < 100);
    System.out.println(num06 < 10 || num07 < 100);
    System.out.println(!bool);

    // 증가, 감소 연산자
    int num08 = 10;
    int num09, num10;

    num09 = num08++;
    num10 = num08--;
    System.out.println(num08);
    System.out.println(num09);
    System.out.println(num10);


  }
}
