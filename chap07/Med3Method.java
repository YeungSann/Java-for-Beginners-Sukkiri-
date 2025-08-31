//
import java.util.Scanner;
class Med3Method{
  static int med(int a, int b, int c){
    int med = 0;
    if ((a > b && b > c) || (c > b && b > a))       return med = b;
    else if ((b > a && a > c) || (c > a && a > b))  return med = a;
    else return med =c;
  }
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("please enter the value of a: "); int a = stdIn.nextInt();
    System.out.print("please enter the value of b: "); int b = stdIn.nextInt();
    System.out.print("please enter the value of c: "); int c = stdIn.nextInt();

    System.out.println("the middle value is: " + med(a, b, c));
  }
}
