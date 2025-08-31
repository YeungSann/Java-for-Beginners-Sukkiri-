//
import java.util.Scanner;
class SignOf{
  static int signOf(int a) {
    int signOf = a;
    if (a > 0)
      return signOf = 1;
    else if (a == 0)
      return signOf = 0;
    else
      return signOf = -1;
  }
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("please enter the value: ");
    int a = stdIn.nextInt();
    System.out.println("the value you entered is return: " + signOf(a) + ".");
  }
}
