//
import java.util.Scanner;
class Min3Method{
  static int min(int a, int b, int c) {
    int min = a;
    if (b < min)   min = b;
    if (c < min)   min = c;
    return min;
  }
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("please enter the value of a: "); int a = stdIn.nextInt();
    System.out.print("please enter the value of b: "); int b = stdIn.nextInt();
    System.out.print("please enter the value of c: "); int c = stdIn.nextInt();

    System.out.println("minimum of the values you entered is: " + min(a, b, c) + ".");
  }
}
