//
import java.util.Scanner;
class ExponentialPower{

  //
  static int leftShift(int x, int n) {
   return x = (x << n);
 }

 static int rightShift(int x, int n) {
   return x = (x >> n);
 }
  //
  static int power(int n){
    int result = 1;
    for (int i = 0; i < n; i++) {
      result *= 2;
    }
    return result;
      //return power;
  }

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("please enter a integer: ");
    int x = stdIn.nextInt();
    System.out.print("please enter the number of left shift: ");
    int n = stdIn.nextInt();
    System.out.print("please enter the number of right shift: ");
    int m = stdIn.nextInt();

    int leftX     = leftShift(x, n);
    int leftCalc  = x * power(n);
    System.out.println("x >> " + n + " = " + leftX);
    System.out.println("x * 2^ " + n + " = " + leftCalc);
    System.out.print("compare the results of left shift is: ");
    System.out.println((leftX == leftCalc) ? "Equal" : "notEquel");


    int rightX    = rightShift(x, m);
    int rightCalc = x / power(n);
    System.out.println("x << "   + n + " = " + rightX);
    System.out.println("x / 2^ " + n + " = " + rightCalc);
    System.out.print("compare the results of right shift is: ");
    System.out.println((rightX == rightCalc) ? "Equal" : "notEquel");
  }
}
